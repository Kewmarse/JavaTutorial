package C.EComposition.B;

public class Composition {
    public static void main(String[] args) {
        Produit produit=new Produit("HP","i7",50,"4","var");


        GestionProduit gestionProduit=new GestionProduit(produit);

        gestionProduit.ajouter();
        gestionProduit.mettreAjour();
        gestionProduit.suprimer();

    }
}
