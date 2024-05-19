package B;

import java.util.Scanner;

public class HArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num=new int[10];
        int sumNum=0;
        int firstLastNum=0;
        for(int i=0;i<3;i++){
            System.out.println("entrez votre valeur :");
            num[i]=scanner.nextInt();
            sumNum+=num[i];
        }
        firstLastNum=num[0]+num[2];
        double oran=firstLastNum/sumNum;

        System.out.println(firstLastNum);
        System.out.println(sumNum);


    }
}
