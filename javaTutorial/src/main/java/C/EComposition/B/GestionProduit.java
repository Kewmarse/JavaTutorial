package C.EComposition.B;

public class GestionProduit {

    public Produit produit;

    public GestionProduit(Produit produit) {
        this.produit=produit;
    }

    public void ajouter(){
        System.out.println("ajouter produit"+produit.nom);
    }
    public void mettreAjour(){
        System.out.println("mettre ajour"+produit.category);
    }
    public void suprimer(){
        System.out.println("suprimer produit"+produit.produitNo);
    }



}
