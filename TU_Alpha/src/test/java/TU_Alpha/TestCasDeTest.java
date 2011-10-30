
package TU_Alpha;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Batterie de tests sur la classe CasDeTest
 * 
 * @version 12 octobre 2011
 */
public class TestCasDeTest 
{




    public TestCasDeTest() 
    {
    }
           
    @BeforeClass
    public static void setUpClass() throws Exception 
    {
    }

    @AfterClass
    public static void tearDownClass() throws Exception 
    {
    }
    
    @Before
    public void setUp() 
    {
    }
    
    @After
    public void tearDown() 
    {
    }

    
    @Test public void casDeTestVide()
    {

        CasDeTest_vide test = new CasDeTest_vide();
        test.setNom("vide");
        test.lancer();
        
        assertTrue( test.obtenirNom().equals("vide") );
        
        Resultat resultats = test.obtenirResultats();

        assertTrue(resultats.obtenirEchoues().isEmpty());
        assertTrue(resultats.obtenirErreursImprevues().isEmpty());
        assertTrue(resultats.obtenirReussis().isEmpty());
  
    }
    
    
    @Test public void casDeTestSimple()
    {

        CasDeTest_simple test = new CasDeTest_simple();
        test.setNom("simple");
        test.lancer();

        
        assertTrue( test.obtenirNom().equals("simple") );
        
        Resultat resultats = test.obtenirResultats();

        assertTrue(resultats.obtenirEchoues().isEmpty());
        assertTrue(resultats.obtenirErreursImprevues().isEmpty());
        assertFalse(resultats.obtenirReussis().isEmpty());
  
    }
    
     
    @Test public void casDeTestComplexe()
    {


        CasDeTest_complexe test = new CasDeTest_complexe();
        test.setNom("complexe");
        test.setSortieXML(true);
        test.lancer();
        
        
        assertTrue( test.obtenirNom().equals("complexe") );
        
        Resultat resultats = test.obtenirResultats();

        assertFalse(resultats.obtenirEchoues().isEmpty());
        assertTrue(resultats.obtenirErreursImprevues().isEmpty());
        assertFalse(resultats.obtenirReussis().isEmpty());
  
    }    
    

}
