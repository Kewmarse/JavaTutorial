import java.util.Scanner;

public class EScanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Entrer le premier numero");
        int numero=scanner.nextInt();
        numero=numero*5;
        System.out.println(numero);
    }
}
