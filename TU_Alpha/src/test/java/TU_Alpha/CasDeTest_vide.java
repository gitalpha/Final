
package TU_Alpha;

import org.junit.*;
import static org.junit.Assert.*;


/**
 * Batterie de tests sur la classe CasDeTest
 * 
 * @version 15 octobre 2011
 */
public class CasDeTest_vide extends CasDeTest
{

        protected void setUp() {
            System.out.println("avant casDeTestVide");
        }

        protected void tearDown() {
            System.out.println("apres casDeTestVide");
            System.out.println("---------------------------------");
        }    

}
