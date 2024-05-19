package C.HInterfacePlanlama.B;

public class DataBaseManager {

    public void ajouterDatabase(IDatabase database){
        database.ajouter();
    }
    public void supprimerDatabase(IDatabase database){
        database.supprimer();
    }
    public void modifierDatabase(IDatabase database){
        database.miseAjour();
    }



}
