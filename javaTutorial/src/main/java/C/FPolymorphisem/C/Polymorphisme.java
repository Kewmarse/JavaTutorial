package C.FPolymorphisem.C;

public class Polymorphisme {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Chien chien = new Chien();
        Chat chat = new Chat();

        //polymorphisme onlari extends edende calisyor
        GestionAnimal gestionAnimal=new GestionAnimal(chien);

        gestionAnimal.donneBruit();


    }
}
