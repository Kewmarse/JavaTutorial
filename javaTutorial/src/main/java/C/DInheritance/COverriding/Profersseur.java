package C.DInheritance.COverriding;

public class Profersseur extends Utilisateur {

    private int rest;
    public double paun;



    public void retirerArgent(int argent){
        this.rest -= rest-argent;

        System.out.println(this.rest);
    }


    @Override
    public void seConnecter(String userName, String password) {
        if(userName.equals("admin") && password.equals("1234")){
            System.out.println("professeur Connexion reussi");
        }else {
            System.out.println("impossible de se connecter professeur ");
        }
    }
}
