import Model.IProduitFactory;
import Model.ProduitA;
import Model.ProduitB;
import Model.ProduitFactory1;
import Model.ProduitFactory2;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        IProduitFactory produitFactory1 = new ProduitFactory1();
    IProduitFactory produitFactory2 = new ProduitFactory2();

    ProduitA produitA = null;
    ProduitB produitB = null;

    System.out.println("Utilisation de la premiere fabrique");
    produitA = produitFactory1.getProduitA();
    produitB = produitFactory1.getProduitB();
    produitA.methodeA();
    produitB.methodeB();

    System.out.println("Utilisation de la seconde fabrique");
    produitA = produitFactory2.getProduitA();
    produitB = produitFactory2.getProduitB();
    produitA.methodeA();
    produitB.methodeB();

  }
    }

