package A;

import java.util.Scanner;

public class PUserPassword {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Utilsateur :");
        String user=input.nextLine();

        System.out.print("Password :");
        String password=input.nextLine();

        if (user.equals("admin") && password.equals("456")){
            System.out.println("Connexion réussie");
        }else{
            System.out.println("La connexion a échoué");
        }
    }
}
