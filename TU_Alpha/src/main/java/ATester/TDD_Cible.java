

package ATester;

/**
 *
 * Classe à tester : Construction des TDD de la libraire TU_Alpha
 *
 *
 * Cette classe contient un ensemble de méthode que l'on va vouloir tester
 *
 *
 *
 */
public class TDD_Cible {


    // Test 1
    // Retourne un boolean
    public boolean est_plus_grand_que_500(int x)
    {
        return x>500;
    }

    // Test 2
    // Retourne un boolean
    // Les tests devront évaluer toutes les lignes de codes
    public boolean est_plus_grand_que_1000(int x)
    {
        // test 2a
        if (x>2000) return true;

        // test 2b
        if (x>1500) return true;

        // test 2c
        if (x>1000) return true;

        // test 2d
        return false;
    }



    // Test 3
    // retourne un "int"
    public int nombreEtatAmericain()
    {
        return 50;
    }


    // Test 4
    // retourne un "double"
    public double PI()
    {
        return 3.1416;
    }



    // Test 5
    // retourne un String
    public String capitaleUSA()
    {
        return "Washington";
    }



    // Test 6
    // méthode statique
    // retourne un objet de type TDD_Cible
    public static TDD_Cible nouveau_TDD_Cible()
    {
        TDD_Cible A = new TDD_Cible();
        A.capitale = A.capitaleUSA();
        A.nb_etat = A.nombreEtatAmericain();

        return A;
    }



    // Test 7
    // méthode qui va planter
    // On divise par zéro
    public boolean ca_va_planter()
    {
        return (4 == (8/0));
    }




    // L'objet TDD_Cible contient 2 variables
    public String capitale;
    public int nb_etat;

    // Constructeur vide
    public TDD_Cible()
    { }

    // Constructeur d'initialisation
    public TDD_Cible(String p_capitale, int p_nb_etat)
    {
        capitale = p_capitale;
        nb_etat = p_nb_etat;
    }



}
