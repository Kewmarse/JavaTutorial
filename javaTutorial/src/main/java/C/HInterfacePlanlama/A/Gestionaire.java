package C.HInterfacePlanlama.A;

public class Gestionaire implements IUtilisateur {


    @Override
    public void seConnecter(String user, String pass) {
        System.out.println("Gestionaire est connecter"+user+" "+pass);
    }

    @Override
    public void enregitre() {
        System.out.println("gestionaier enregistre");
    }

    @Override
    public void envoyerMessage() {
        System.out.println("gestionaier envoyer message");
    }
}
