package C.DInheritance.BSuper;

public class Utilisateur {
    private String userName;
    private String password;

    public Utilisateur(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

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


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
