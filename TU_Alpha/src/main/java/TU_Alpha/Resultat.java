
package TU_Alpha;


import java.util.Iterator;
import java.util.Vector;

import java.io.*;
import java.util.*;

/**
 * Classe qui recoit les resultats de tous les tests
 * 
 * @version 20 octobre 2011
 */
public class Resultat extends Object { 
    
    // Chaine du nom du cas de test
    private String nomCasDeTest;
    public void setNomCasDeTest(String a_nomCasDeTest) { nomCasDeTest = a_nomCasDeTest; }
    
    // La sortie désiré en XML ou en texte(défaut)
    private boolean sortieXML = false;
    public void setSortieXML(boolean a_sortieXML) { sortieXML = a_sortieXML; }
    
    // Erreurs imprévues (tests qui plantent)
    private Vector lesErreursImprevues = new Vector();
    public Vector obtenirErreursImprevues() { return lesErreursImprevues; }
    
    // Echecs de test
    private Vector lesEchoues = new Vector();
    public Vector obtenirEchoues() { return lesEchoues; }
    
    // Reussits de test
    private Vector lesReussis = new Vector();
    public Vector obtenirReussis() { return lesReussis; }
    
    
    /**
     * Constructeur
     */
    public Resultat ()
    {
        nomCasDeTest="";
    }
    
    
    
    // Les fonctions publiques
    // les tests qui plantent
    public void ajouterErreurImprevue( String nomTest ) { 
        lesErreursImprevues.addElement( nomTest ); 
    } 
    
    // Echoues
    public void ajouterEchoue( String nomTest ) { 
        lesEchoues.addElement( nomTest ); 
    }

    // Réussis
    public void ajouterReussi( String nomTest ) {
        lesReussis.addElement( nomTest ); 
    }
    
    

    public void ecrire()
    {
        
        StringBuilder buf = new StringBuilder();

        System.out.println(" TU_ALPHA ::: Debut du test = " + nomCasDeTest);

        String enteteXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        buf.append(sortieXML
                ? enteteXML + "<CasDeTest nom=\"" + nomCasDeTest + "\">\n"
                : " TU_ALPHA ::: Debut du test = " + nomCasDeTest+ "\n");

        
        // On boucle sur les réussis
        buf.append(resultatMethode(lesReussis, "reussi"));
        // On boucle sur les échoués
        buf.append(resultatMethode(lesEchoues, "echoue"));
        // On boucle sur ceux qui ont plantés
        buf.append(resultatMethode(lesErreursImprevues, "plante"));


        String fin_du_fichier= 
                " TU_ALPHA ::: Nombre de tests reussis = " + lesReussis.size() + "\n" +
                " TU_ALPHA ::: Nombre de tests total = " +
                     + (lesReussis.size() + lesEchoues.size() + lesErreursImprevues.size()) + "\n" +
                " TU_ALPHA ::: Fin du test = " + nomCasDeTest + "\n";

        System.out.print(fin_du_fichier);
        System.out.println(" ");

        buf.append(sortieXML
                ? "</CasDeTest>"
                : fin_du_fichier);
        
        
        ecrireFichier(buf);

    }
	
	
	private void ecrireFichier(StringBuilder buf)
	{
        // Ecrire dans un fichier ( .log  ou  .xml )
        String extension = sortieXML ? ".xml" : ".log";
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(nomCasDeTest + extension));
            out.write(buf.toString());
            out.newLine();
            out.close();
        } catch (IOException e) {
            System.out.println("   TU_ALPHA  Erreur d'execution : Ouverture du fichier :" + nomCasDeTest + extension);
        }	
	}
    
    // Pour chaque type de résultat
    private String resultatMethode(Vector v_methode, String a_type)
    {
        StringBuilder buf = new StringBuilder("");
        
        for (Iterator it = v_methode.iterator(); it.hasNext();) {
            String nomDeLaMethode = (String) it.next();
            
            String s = "     TU_ALPHA ::: Methode " + nomDeLaMethode + " a " + a_type + "\n";
            
            System.out.print(s);
            
            buf.append(sortieXML
                       ? "   <Test nom=\"" + nomDeLaMethode + "\" resultat=\"" + a_type + "\"/>\n"
                       : s);
        }
                
        return buf.toString();
    }
    
    
            
}


