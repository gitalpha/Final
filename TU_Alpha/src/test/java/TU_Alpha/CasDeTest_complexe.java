
package TU_Alpha;

/**
 * Corbertura ne peut pas fonctionner avec des "inner-classes"
 * @version 15 octobre 2011
 */
public class CasDeTest_complexe extends CasDeTest {

    protected void setUp()
    {
        System.out.println( "avant casDeTestComplexe" );
    }


    protected void tearDown()
    {
        System.out.println( "apres casDeTestComplexe" );
        System.out.println( "---------------------------------" );
    }


    public boolean test_un_egale_un_entier()
    {
        Integer i = 1, j = 1;
        Boolean resultat = new Assertion().egaux( i, j );
        System.out.println("test_un_egale_un_entier() " + resultat);
        return resultat;
    }


    public boolean test_un_egale_un_entier2()
    {
        int i = 1, j = 1;
        Boolean resultat = new Assertion().egaux( i, j );
        System.out.println("test_un_egale_un_entier2() " + resultat);
        return resultat;
    }

    public boolean test_un_egale_un_chaine()
    {
        String i = "1";
        String j = "1";
        Boolean resultat = new Assertion().egaux( i, j );
        System.out.println("test_un_egale_un_chaine() " + resultat);
        return resultat;
    }

    public boolean test_types_differents()
    {
        Integer i = 1;
        String j = "1";
        Boolean resultat = new Assertion().egaux( i, j );
        System.out.println("test_types_differents() " + resultat);
        return resultat;
    }


}
