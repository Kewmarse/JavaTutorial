package C.HInterfacePlanlama.B;

public class InterfaceEx {
    public static void main(String[] args) {

        DataBaseManager dbm = new DataBaseManager();
        dbm.ajouterDatabase(new MySQL());


    }
}
