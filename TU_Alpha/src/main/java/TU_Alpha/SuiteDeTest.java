package TU_Alpha;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Design pattern Composite (implémentation minimale)
 *
 * SuiteDeTest est un CasDeTest, il peut contenir des SuiteDeTest et des CasDeTest
 * 
 * @version : 20 octobre 2011
 */
public class SuiteDeTest extends CasDeTest {

    protected ArrayList tab = new ArrayList();

    // Méthode minimale pour le Composite
    // On ajoute des CasDeTest ou d'autres SuiteDeTest
    public void add(CasDeTest comp) {
        this.tab.add(comp);
    }



    public void lancer() {

        // On lance les enfants
        Iterator itr = tab.iterator();
        while (itr.hasNext()) {
            CasDeTest element = (CasDeTest) itr.next();
            element.lancer();
        }
    }  
    
}
