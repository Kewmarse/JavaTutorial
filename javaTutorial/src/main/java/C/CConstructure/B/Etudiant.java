package C.CConstructure.B;

public class Etudiant {

    private String nom;
    private String prenom;
    private int univNo;
    private int anneNaissance;

  public Etudiant(int num){
      System.out.println("nouveux numero :"+(num+10));
  }

  public Etudiant(String nom, String prenom, int univNo, int anneNaissance){
      this.nom = nom;
      this.prenom = prenom;
      this.univNo = univNo;
      this.anneNaissance = anneNaissance;

      System.out.println("ici");

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
