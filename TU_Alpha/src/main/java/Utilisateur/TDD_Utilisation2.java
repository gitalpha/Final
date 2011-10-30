

package Utilisateur;

import TU_Alpha.*;

import ATester.*;




/**
 *    Test d'acceptation : Une utilisation de la librairie de tests TU_Alpha
 *
 *    Construction de plusieurs tests (méthode TDD)
 *    Cette classe teste les méthodes de la Classe ATester.TDD_Cible
 *
 *    Un utilisateur veut utiliser la librairie TU_alpha pour
 *    tester la classe "ATester.TDD_Cible".
 *    Il va écrire cette classe: "TDD_Utilisation2".
 *
 */
public class TDD_Utilisation2 extends CasDeTest
{

    // Surcharge des méthodes setUp et tearDown
    public void setUp(int i)
    {
        System.out.println(" ERREUR ERREUR  ERREUR ERREUR  ERREUR ERREUR ");
        System.out.println("   Cette méthode ne doit pas être appelé par notre librairie ");
        System.out.println("   La méthode setUp ne doit pas avoir de paramètre ");

    }

    // Surcharge des méthodes setUp et tearDown
    public void setUp()
    {
    }

    public void tearDown()
    {
        
    }





    // test 5
    // L'utilisateur de notre librairie alpha veut
    // tester capitaleUSA
    //
    //  Il va écrire cette méthode
    public boolean test5()
    {
        TDD_Cible tdd_Cible  = new TDD_Cible();

        String resultatEspere = "Washington"; // on espere ce résultat

        String le_resultat = tdd_Cible.capitaleUSA();

        // Assert égalité
        return new Assertion().egaux(le_resultat, resultatEspere);

    }





    // test 6
    // L'utilisateur de notre librairie alpha veut
    // tester la méthode statique nouveau_TDD_Cible
    //
    //  Il va écrire cette méthode
    public boolean test6()
    {
        TDD_Cible resultatEspere  = new TDD_Cible();  // on espere ce résultat
        resultatEspere.capitale = resultatEspere.capitaleUSA();
        resultatEspere.nb_etat = resultatEspere.nombreEtatAmericain();

        TDD_Cible le_resultat = TDD_Cible.nouveau_TDD_Cible();

        // Assert égalité
        // Ce test doit échouer, car même si ces deux instances sont
        // identiques, le "equals" est celui de Object, et il considère que
        // ce sont deux objets différents
        return new Assertion().egaux(le_resultat, resultatEspere);

    }






    // test 7
    // L'utilisateur de notre librairie alpha veut
    // tester la méthode TDD_Cible.ca_va_planter
    //
    //  Il va écrire cette méthode
    public boolean test7()
    {
        TDD_Cible resultatEspere  = new TDD_Cible();  // on espere ce résultat

        // Ce test va planter car on divise par zéro !!!
        return resultatEspere.ca_va_planter();

    }




    // test 8
    // Cette méthode ne doit pas être appelé par la librairie TU_Alpha
    // car elle ne retourne pas un boolean
    // La librairie TU_Alpha ne lance pas les méthodes qui ne retourne pas un boolean...
    //
    public int test8()
    {
        System.out.println(" ERREUR   ERREUR   ERREUR   ERREUR  ");
        System.out.println("    La méthode TDD_Utilisation2.test8()   ne doit pas être exécuté !!! Erreur !  ");
        return 0;
    }




    // test 9
    // Cette méthode ne doit pas être appelé par la librairie TU_Alpha
    // car elle a des paramètres
    // La librairie TU_Alpha ne lance pas les méthodes qui ont des paramètres...
    //
    public boolean test9(int i)
    {
        System.out.println(" ERREUR   ERREUR   ERREUR   ERREUR  ");
        System.out.println("    La méthode TDD_Utilisation2.test9()   ne doit pas être exécuté !!! Erreur !  ");
        return false;
    }





}

