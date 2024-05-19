package C.HInterfacePlanlama.A;

public class Professeur implements IUtilisateur {


    @Override
    public void seConnecter(String user, String pass) {
        System.out.println("Connecter au professeur"+user+":"+pass);
    }

    @Override
    public void enregitre() {
        System.out.println("Enregistre professeur");
    }

    @Override
    public void envoyerMessage() {
        System.out.println("Envoyer message");
    }
}
