package TU_Alpha;

import java.lang.reflect.Method;

/**
 *
 * Voici la classe principale de notre librairie
 * Elle utilise le pattern "Pluggable Selector"
 *
 * version 23 octobre 2011
 *
 */
public abstract class CasDeTest {

    // Le préfixe des méthodes qui seront lancées
    public static final String PREFIXE_TEST = "test";
    public static final String METHODE_SET_UP = "setUp";
    public static final String METHODE_TEAR_DOWN = "tearDown";

    // chaine identifiant le CasDeTest
    private String nom;
    
    // La sortie désiré en XML ou en texte(défaut)
    private boolean sortieXML = false;
    
    // Objet Resultat contenant les resultats des tests de ce cas de tests
    private Resultat resultats  = new Resultat();
    

    /*
     * Obtenir le nom du test
     * @return nom
     */
    public String obtenirNom() 
    {
        return nom;
    }

    /*
     * Modifier le nom du cas de test
     */
    public void setNom(String a_nom) 
    {
        this.nom = a_nom;
    }
    
    public void setSortieXML( Boolean a_sortieXML )
    {
        sortieXML = a_sortieXML;
    }
    
    public Resultat obtenirResultats()
    { return resultats; }



    /*
     * Debuter ce cas de test par cette methode
     */
    public void lancer() 
    {

        resultats.setNomCasDeTest(nom);
        resultats.setSortieXML(sortieXML);
        
	// La classe qui contient les méthodes de tests
        Class notreClasseDeTest = getClass();

        Method[] M = getClass().getMethods();

        // Boucler sur toutes les méthodes de la classe
        for (int i = 0; i < M.length; i++) 
        {

            Method notreMethodeDeTest = M[i];
            String le_nom_de_la_methode = notreMethodeDeTest.getName();

            // Si la méthode commence par test et qu'elle
            // retourne un boolean, et qu'elle n'a pas de paramètres, on la lance !
            if (le_nom_de_la_methode.startsWith(PREFIXE_TEST)
                &&
                (notreMethodeDeTest.getGenericReturnType() == boolean.class)
                &&
                (notreMethodeDeTest.getGenericParameterTypes().length==0)) 
            {


                // Nous avons trouvé notre méthode de test !!
                try 
                {

                    // Pour nous assurer de l'indépendance de chaque test, nous
                    // allons instancier chaque classe de test avant
                    // chaque appel de la méthode de test !
                    Object notreObjetDeTest = notreClasseDeTest.newInstance();


                    // Appel de la méthode setUp() au début de chaque test
                    // seulement si elle est présente
                    try 
                    {
                        Method notreMethodeSetUp = notreObjetDeTest.getClass().getMethod(METHODE_SET_UP);
                        // pas de paramètres s.v.p.!
                        if (notreMethodeSetUp.getGenericParameterTypes().length == 0) 
                        {
                            notreMethodeSetUp.invoke(notreObjetDeTest);
                        }

                    } 
                    catch (NoSuchMethodException n) 
                    {
                        ; // Pas de problème, on ne force pas l'utilisateur à avoir une méthode setUp()
                    }


                    Boolean B = (Boolean) notreMethodeDeTest.invoke(notreObjetDeTest);

                    if (B.booleanValue()) 
                    {
                        resultats.ajouterReussi(le_nom_de_la_methode);
                    } 
                    else
                    {
                        resultats.ajouterEchoue(le_nom_de_la_methode);
                    }

                    // Appel de la méthode tearDown() au début de chaque test
                    // seulement si elle est présente
                    try 
                    {
                        Method notreMethodeTearDown = notreObjetDeTest.getClass().getMethod(METHODE_TEAR_DOWN);
                        // pas de paramètres s.v.p.!
                        if (notreMethodeTearDown.getGenericParameterTypes().length == 0) 
                        {
                            notreMethodeTearDown.invoke(notreObjetDeTest);
                        }

                    } 
                    catch (NoSuchMethodException n) 
                    {
                        ; // Pas de problème, on ne force pas l'utilisateur à avoir une méthode tearDown()
                    }

                } 
                catch (Exception e) 
                {
                    resultats.ajouterErreurImprevue(le_nom_de_la_methode);
                }
            }
        }

        // On imprime !!
        resultats.ecrire();

    }



    
    
    
    
}
