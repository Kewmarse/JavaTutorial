package C.BEcapsulation.F;

public class Utilsateur {
    private String nom="rahmani";
    private String prenom="Kewmarse";
    private String email="kewmarse8@gmail.com";
    private int age=25;

    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("donne un age valable ");
        }

    }



}
