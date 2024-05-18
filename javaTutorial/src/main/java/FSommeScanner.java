import java.util.Scanner;

public class FSommeScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le premier numero: ");
        int numero1=scanner.nextInt();

        System.out.println("Entrez le deuxieme numero: ");
        int numero2=scanner.nextInt();

        int result=numero1+numero2;
        System.out.println("votre result est :"+result);

    }

}
