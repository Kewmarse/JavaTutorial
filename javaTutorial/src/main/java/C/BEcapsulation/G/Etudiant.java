package C.BEcapsulation.G;

public class Etudiant {

    private String nom;
    private String prenom;
    private int univNo;
    private int dateNAisance;

    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        if (nom.isEmpty()){
            System.out.println("Le nom est vide");
        }else {
        this.nom = nom;
    }
    }

    public String getPrenom() {
        return prenom;
    }


    public void setPrenom(String prenom) {
        if (prenom.isEmpty()){
            System.out.println("Le prenom est vide");
        }else {
        this.prenom = prenom;
    }}

    public int getUnivNo() {
        return univNo;
    }



    public void setUnivNo(int univNo) {
        if (univNo < 1000){
            System.out.println("Entrez le numéro de l'école supérieur à 1000");
        }else {
        this.univNo = univNo;
    }}

    public int getDateNAisance() {
        return dateNAisance;
    }


    public void setDateNAisance(int dateNAisance) {
        if (dateNAisance<1990 && dateNAisance>2005){
            this.dateNAisance = dateNAisance;
        }else {
            System.out.println("Entrez une date de naissance valide");
        }
    }
}
