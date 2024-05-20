package C.MEntreSorti.AEcrire;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamkavram {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream=null;
        try {
             fileOutputStream=new FileOutputStream("dosya.txt",true);//eski yazi silinmiyor
            fileOutputStream.write(78);
            fileOutputStream.write(66);

            byte [] array={66,65,66,65};
            fileOutputStream.write(array);

            String name="Kewmarse RAHMANI";
            byte [] array2=name.getBytes();
            fileOutputStream.write(array2);


        }catch (FileNotFoundException e){
            System.out.println("l'erreur est "+e);
        }catch (IOException e) {
            System.out.println("dosya il ya un erreur ");
        }
        finally {
            try {
                if (fileOutputStream!=null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                System.out.println("il ya un erreur ");
            }
        }
    }
}
