package C.GAbstractZorunluOverRide;

public abstract class Utilsateur {

    public void seConnecter(String user, String pass){
        if (user.equals("admin" )&& pass.equals("123")){
        System.out.println("utilisateur est connecter ");
    }else {
            System.out.println("utilisateur non est connecter ");
        }
    }

    abstract void register();


}
