package C.MEntreSorti.BLire;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadEx {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis=new FileInputStream("dosya.txt");

            int valeur;
            String s="";
            while ((valeur=fis.read())!=-1){
                s +=(char) valeur;
            }
            System.out.println(s);


        } catch (FileNotFoundException e) {
            System.out.println("il n'ya pas trouve le dosya  ");
        }catch (IOException e) {
            System.out.println("il ya des erreur de lire ");
        }
        finally {
            try {
                if (fis!=null){
                    fis.close();
                }
            }catch (IOException e){
                System.out.println("des erreur des fermateur ");
            }
        }



    }


}

