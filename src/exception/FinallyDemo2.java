package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author longma
 * @create 2022-03-30-14:57
 **/
public class FinallyDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
       // FileOutputStream fos = new FileOutputStream("");
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("fos.dat");
            fos.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos!=null){
                    fos . close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
