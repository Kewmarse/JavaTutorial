package C.FPolymorphisem.AStackHeap;

public class StackHeap {
    public static void main(String[] args) {
        Personne p1=new Personne();
        Personne p2=p1;

        p1.nom="ali";


        System.out.println(p2.nom);

    }
}
