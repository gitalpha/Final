

package TU_Alpha;


/**
 * Classe d'assertion de type générique
 * 
 * @version 28 septembre 2011
 */
public class Assertion<T> {
    public Boolean egaux( T element1, T element2 ) {
	    if  ((element1==null) || (element2==null)) return false;
        return element1.equals( element2 );
    }
}
