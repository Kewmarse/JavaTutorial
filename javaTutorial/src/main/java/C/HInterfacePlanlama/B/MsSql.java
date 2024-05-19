package C.HInterfacePlanlama.B;

public class MsSql implements IDatabase{
    @Override
    public void ajouter() {
        System.out.println("ajouter MsSql");
    }

    @Override
    public void supprimer() {
        System.out.println("supprimer MsSql");
    }

    @Override
    public void miseAjour() {
        System.out.println("miseAjour MsSql");
    }
}
