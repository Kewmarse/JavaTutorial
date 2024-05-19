package C.HInterfacePlanlama.B;

public class MySQL implements IDatabase{
    @Override
    public void ajouter() {
        System.out.println("Ajout de MySQL");
    }

    @Override
    public void supprimer() {
        System.out.println("Supprimer de MySQL");
    }

    @Override
    public void miseAjour() {
        System.out.println("MiseAjour de MySQL");
    }
}
