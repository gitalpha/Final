package Utilisateur;

import TU_Alpha.*;

import java.util.ArrayList;
import java.util.List;

/**
 *    Test d'acceptation : Une utilisation de la librairie de tests TU_Alpha
 *
 *    Construction de plusieurs tests (méthode TDD)
 *
 *    Un utilisateur veut utiliser la librairie TU_alpha pour
 *    tester la séparation complète de chaque test
 * 
 *   Voir Fowler : http://martinfowler.com/bliki/JunitNewInstance.html
 * 
 *    Il va écrire cette classe: "TDD_Utilisation3".
 *
 */
public class TDD_Utilisation3 extends CasDeTest {

    

    // Surcharge des méthodes setUp et tearDown
    public void setUp() {

    }

    public void tearDown() {

    }

    
    List list = new ArrayList();

    public boolean testFirst() {
        list.add("one");

        // Assert égalité
        return new Assertion().egaux(1, list.size());
    }

    public boolean testSecond() {

        // Assert égalité
        return new Assertion().egaux(0, list.size());
    }
}
