package C.JInnerClass.B;


public class CAnonim {
    public static void main(String[] args) {
IUtilsateur iUtilsateur=new IUtilsateur() {
    @Override
    public void seConnecter() {
        System.out.println("le utilsateur se connecter");
    }

    @Override
    public void creerUnCompte() {
        System.out.println("le utilsateur creerUnCompte");
    }
};
iUtilsateur.seConnecter();


    }
    public interface IUtilsateur{
       public void seConnecter();
       public void creerUnCompte();
    }
}
