package C.LException.D;

import java.io.IOException;

public class ThrowsEx {
        public static void ageControl(int age)throws IOException {
          if (age<18){
              throw new IOException();
          }else {
              System.out.println("vous etes dans legale age "+age);
          }
    }
    public static void main(String[] args) throws IOException {
        ageControl(1);

    }
}
