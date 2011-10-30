
package TU_Alpha;

import org.junit.*;
import static org.junit.Assert.*;


/**
 * Batterie de tests sur l'assertion
 * 
 * @version 30 octobre 2011
 */
public class AssertionTest {
    
    public AssertionTest() {
    }

    @BeforeClass
    public static void setUpClass(){
    }

    @AfterClass
    public static void tearDownClass(){
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test public void un_egale_un_entier(){
        Assertion t = new Assertion();
        Integer i = 1, j = 1;
        
        assertTrue("Integer 1 egale 1", t.egaux( i, j ) );
    }

    @Test public void un_egale_un_entier2(){
        Assertion t = new Assertion();
        int i = 1, j = 1;
        
        assertTrue("int 1 egale 1", t.egaux( i, j ) );
    }

    @Test public void un_egale_un_chaine(){
        Assertion t = new Assertion();
        String i = "1";
        String j = "1";
        
        assertTrue("String 1 egale 1", t.egaux( i, j ) );
    }
    
    @Test public void types_differents(){
        Assertion t = new Assertion();
        Integer i = 1;
        String j = "1";
        
        assertFalse("types_differents 1 n'egale pas '1'", t.egaux( i, j ) );
    }

    @Test public void un_parametre_nul(){
        Assertion t = new Assertion();
        Integer i = 1;
        String j = null;
        
        assertFalse("un_parametre_nul, il n'y a pas de paramètre nul ?!", t.egaux( i, j ) );
    }
    
    @Test public void deux_parametres_nuls(){
        Assertion t = new Assertion();
        Integer i = null;
        String j = null;
        
        assertFalse("deux_parametres_nuls, les paramètres ne sont pas nuls ?!", t.egaux( i, j ) );
    }
    
}
