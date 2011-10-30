

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
 *    Il va écrire cette classe: "TDD_Utilisation1".
 *
 */
public class TDD_Utilisation1 extends CasDeTest
{

    // Surcharge des méthodes setUp et tearDown
    public void setUp()
    {
        
    }
    
    public void tearDown()
    {
        
    }


    // Test 1
    // L'utilisateur de notre librairie alpha veut
    // tester test_est_plus_grand_que_500
    //
    //  Il va écrire cette méthode
    public boolean test1()
    {
        TDD_Cible tdd_Cible  = new TDD_Cible();

        boolean resultatEspere = true; // on espere ce résultat, car 600 est plus grand que 500
        int x = 600;

        boolean le_resultat = tdd_Cible.est_plus_grand_que_500(x);

        // Assert égalité
        return new Assertion().egaux(le_resultat, resultatEspere);

    }





    // test 2a
    // L'utilisateur de notre librairie alpha veut
    // tester test_est_plus_grand_que_1000
    //
    //  Il va écrire cette méthode
    public boolean test2a()
    {
        TDD_Cible tdd_Cible  = new TDD_Cible();

        boolean resultatEspere = true; // on espere ce résultat, car 2100 est plus grand que 2000
        int x = 2100;

        boolean le_resultat = tdd_Cible.est_plus_grand_que_1000(x);

        // Assert égalité
        return new Assertion().egaux(le_resultat, resultatEspere);

    }




    // test 2b
    // L'utilisateur de notre librairie alpha veut
    // tester test_est_plus_grand_que_1000
    //
    //  Il va écrire cette méthode
    public boolean test2b()
    {
        TDD_Cible tdd_Cible  = new TDD_Cible();

        boolean resultatEspere = true; // on espere ce résultat, car 1600 est plus grand que 1500
        int x = 1600;

        boolean le_resultat = tdd_Cible.est_plus_grand_que_1000(x);

        // Assert égalité
        return new Assertion().egaux(le_resultat, resultatEspere);

    }



    // test 2c
    // L'utilisateur de notre librairie alpha veut
    // tester test_est_plus_grand_que_1000
    //
    //  Il va écrire cette méthode
    public boolean test2c()
    {
        TDD_Cible tdd_Cible  = new TDD_Cible();

        boolean resultatEspere = true; // on espere ce résultat, car 1100 est plus grand que 1000
        int x = 1100;

        boolean le_resultat = tdd_Cible.est_plus_grand_que_1000(x);

        // Assert égalité
        return new Assertion().egaux(le_resultat, resultatEspere);

    }



    // test 2d
    // L'utilisateur de notre librairie alpha veut
    // tester test_est_plus_grand_que_1000
    //
    //  Il va écrire cette méthode
    public boolean test2d()
    {
        TDD_Cible tdd_Cible  = new TDD_Cible();

        boolean resultatEspere = false; // on espere ce résultat, car 900 est plus petit que 1000
        int x = 900;

        boolean le_resultat = tdd_Cible.est_plus_grand_que_1000(x);

        // Assert égalité
        return new Assertion().egaux(le_resultat, resultatEspere);

    }






    // test 3
    // L'utilisateur de notre librairie alpha veut
    // tester nombreEtatAmericain
    //
    //  Il va écrire cette méthode
    public boolean test3()
    {
        TDD_Cible tdd_Cible  = new TDD_Cible();

        int resultatEspere = 50; // on espere ce résultat

        int le_resultat = tdd_Cible.nombreEtatAmericain();

        // Assert égalité
        return new Assertion().egaux(le_resultat, resultatEspere);

    }




    // test 4
    // L'utilisateur de notre librairie alpha veut
    // tester PI
    //
    //  Il va écrire cette méthode
    public boolean test4()
    {
        TDD_Cible tdd_Cible  = new TDD_Cible();

        double resultatEspere = 3.1416; // on espere ce résultat

        double le_resultat = tdd_Cible.PI();

        // Assert égalité
        return new Assertion().egaux(le_resultat, resultatEspere);

    }









}

