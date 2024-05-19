package C.CConstructure.A;

public class Etudiant {

    private String nom;
    private String prenom;
    private int univNo;
    private int anneNaissance;

  public Etudiant(){
      this.nom = "ali";
      this.prenom = "akbar";
      this.univNo = 1000;
      this.anneNaissance = 2000;
  }






    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getUnivNo() {
        return univNo;
    }

    public void setUnivNo(int univNo) {
        this.univNo = univNo;
    }

    public int getAnneNaissance() {
        return anneNaissance;
    }

    public void setAnneNaissance(int anneNaissance) {
        this.anneNaissance = anneNaissance;
    }
}
