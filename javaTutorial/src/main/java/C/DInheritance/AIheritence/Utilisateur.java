package C.DInheritance.AIheritence;

public class Utilisateur {
    private String userName;
    private String password;

    public void seConnecter(String userName, String password){
        if(userName.equals("admin") && password.equals("1234")){
            System.out.println("Connexion reussi");
        }else {
            System.out.println("impossible de se connecter");
        }

    }
    public void envoyerMessage(){
        System.out.println("le message a ete envoyer ");
    }







}
