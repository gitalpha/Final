

package Utilisateur;


import TU_Alpha.*;


/**
 *  Test d'acceptation : Une utilisation de la librairie de tests TU_Alpha
 *
 *  Lancement des tests
 *          TDD_Utilisation1.java
 *          TDD_Utilisation2.java
 *          TDD_Utilisation3.java
 *
 *  @version : 21 octobre 2011
 *      
 */
public class TDD_Run_CasDeTest {



    // L'utilisateur de notre librairie alpha veut
    // exécuter tous les tests de TDD_Utilisation1, TDD_Utilisation2, TDD_Utilisation3 d'un seul coup
    //  Voici la méthode "main" qu'il va exécuter
    public static void main(String args[])
    {

        // Paramètre -x pour la sortieXml
        boolean sortieXML = false;
        if (args!=null)
        if (args.length>0)
        {
            if (args[0].equalsIgnoreCase("-x")) sortieXML = true;
        }
        
        System.out.println(" Debut des tests de l'utilisateur (TDD_Utilisation1, TDD_Utilisation2, TDD_Utilisation3) ");

        TDD_Utilisation1 TN1 = new TDD_Utilisation1();
        TN1.setNom("TDD_Utilisation1");
        TN1.setSortieXML(sortieXML);

        TDD_Utilisation2 TN2 = new TDD_Utilisation2();
        TN2.setNom("TDD_Utilisation2");
        TN2.setSortieXML(true);  // On force le XML

        TDD_Utilisation3 TN3 = new TDD_Utilisation3();
        TN3.setNom("TDD_Utilisation3");
        TN3.setSortieXML(false);  // On force le fichier texte



        SuiteDeTest suite1 = new SuiteDeTest();
        suite1.add(TN1);
        suite1.add(TN2);

        SuiteDeTest suite2 = new SuiteDeTest();
        suite2.add(suite1);
        suite2.add(TN3);


        // On lance tout !
        suite2.lancer();

        System.out.println(" Fin des tests de l'utilisateur (TDD_Utilisation1, TDD_Utilisation2, TDD_Utilisation3) ");

    }


}
