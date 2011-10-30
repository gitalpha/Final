
package TU_Alpha;

/**
 * Corbertura ne peut pas fonctionner avec des "inner-classes"
 * @version 15 octobre 2011
 */
public class CasDeTest_simple extends CasDeTest {

    protected void setUp() {
        System.out.println("avant casDeTestSimple");
    }

    protected void tearDown() {
        System.out.println("apres casDeTestSimple");
        System.out.println("---------------------------------");
    }

    public boolean test_un_egale_un_entier() {
        Integer i = 1, j = 1;

        boolean resultat = new Assertion().egaux(i, j);

        System.out.println("test_un_egale_un_entier() " + resultat);

        return resultat;
    }
}
