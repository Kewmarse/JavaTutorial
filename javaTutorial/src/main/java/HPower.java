import java.util.Scanner;

public class HPower {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Entrez la valeur de mass");
        double mass=input.nextDouble();

        System.out.println("Entrez la valeur de l'acceleration");
        double acceleration=input.nextDouble();

        System.out.println("Force :"+mass*acceleration);
    }
}
