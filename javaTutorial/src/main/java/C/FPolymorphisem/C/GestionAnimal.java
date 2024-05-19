package C.FPolymorphisem.C;

public class GestionAnimal {

    public Animal animal;

    public GestionAnimal(Animal animal) {

        this.animal=animal;
    }

    public void donneBruit(){
        animal.faireBruit();
    }



}
