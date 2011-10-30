
package TU_Alpha;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Batterie de tests sur la classe Resultat
 * 
 * @version 12 octobre 2011
 */
public class ResultatTest {
    
    public ResultatTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test public void resultatVide(){

        Resultat resultat = new Resultat();
        
        assertTrue(resultat.obtenirEchoues().isEmpty());
        assertTrue(resultat.obtenirErreursImprevues().isEmpty());
        assertTrue(resultat.obtenirReussis().isEmpty());
  
    }
    
    @Test public void resultatUnTest(){

        Resultat resultat = new Resultat();
        
        assertTrue(resultat.obtenirEchoues().isEmpty());
        assertTrue(resultat.obtenirErreursImprevues().isEmpty());
        assertTrue(resultat.obtenirReussis().isEmpty());
  
    }
    
    @Test public void resultatUnTestReussi(){

        Resultat resultat = new Resultat();

        resultat.ajouterReussi("unTestReussit");
        
        assertTrue(resultat.obtenirEchoues().isEmpty());
        assertTrue(resultat.obtenirErreursImprevues().isEmpty());
        assertFalse(resultat.obtenirReussis().isEmpty());
  
    }
    
    @Test public void resultatUnTestEchoue(){

        Resultat resultat = new Resultat();
        
        resultat.ajouterEchoue("unTestEchoue");
        
        assertFalse(resultat.obtenirEchoues().isEmpty());
        assertTrue(resultat.obtenirErreursImprevues().isEmpty());
        assertTrue(resultat.obtenirReussis().isEmpty());
  
    }
    
    @Test public void resultatUneErreurImprevue(){

        Resultat resultat = new Resultat();
        
        resultat.ajouterErreurImprevue("uneErreurImprevue");
        
        assertTrue(resultat.obtenirEchoues().isEmpty());
        assertFalse(resultat.obtenirErreursImprevues().isEmpty());
        assertTrue(resultat.obtenirReussis().isEmpty());
  
    }
    
    
    @Test public void resultatComplexe(){

        Resultat resultat = new Resultat();
        
        resultat.ajouterReussi("unTestReussit1");
        resultat.ajouterEchoue("unTestEchoue1");
        resultat.ajouterErreurImprevue("uneErreurImprevue1");
        resultat.ajouterErreurImprevue("uneErreurImprevue2");
        resultat.ajouterEchoue("unTestEchoue2");
        resultat.ajouterReussi("unTestReussit2");  
        
        assertFalse(resultat.obtenirEchoues().isEmpty());
        assertFalse(resultat.obtenirErreursImprevues().isEmpty());
        assertFalse(resultat.obtenirReussis().isEmpty());
        
        assertEquals(resultat.obtenirReussis().elementAt(0), "unTestReussit1");
        assertEquals(resultat.obtenirReussis().elementAt(1), "unTestReussit2");
        
        assertEquals(resultat.obtenirEchoues().elementAt(0), "unTestEchoue1");
        assertEquals(resultat.obtenirEchoues().elementAt(1), "unTestEchoue2");
        
        assertEquals(resultat.obtenirErreursImprevues().elementAt(0), "uneErreurImprevue1");
        assertEquals(resultat.obtenirErreursImprevues().elementAt(1), "uneErreurImprevue2");
          
    }
    
}
