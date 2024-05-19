package C.DInheritance.COverriding;

public class Etudiant extends Utilisateur {

    private String numberCourse;


    public void paun(){
        System.out.println("il pris le paun");
    }

    @Override
    public void seConnecter(String userName, String password) {

        if(userName.equals("admin") && password.equals("1234")){
            System.out.println("Etudiant Connexion reussi");
        }else {
            System.out.println("impossible de se connecter Etudiant ");
        }    }
}
