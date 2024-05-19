package B;

import java.util.Scanner;

public class CWHILE {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true){
        System.out.println("entrez de num :");
        int num = scanner.nextInt();
        if (num == 0){
            break;
        }
    }

}}
