package Work;

import java.io.*;
import java.util.Scanner;

/**
 * @author longma
 * @create 2022-03-29-21:18
 **/
public class Test07 {
    public static void main(String[] args) throws IOException {
        System.out.println("要复制的路径");
        String f=new Scanner(System.in).nextLine();
        File from = new File(f);
        System.out.println("复制到路径");
        String t = new Scanner(System.in).nextLine();
        File to = new File(t);
        zjCopy(from,to);
    }

    private static void zjCopy(File from, File to) throws IOException {
        int start=(int) System.currentTimeMillis();
        BufferedInputStream inb = new BufferedInputStream(new FileInputStream(to));
       BufferedOutputStream tob = new BufferedOutputStream(new FileOutputStream(from));

        int b=0;
        while ((b=inb.read())!=-1){
            tob.write(b);
        }
        inb.close();
        tob.close();
    }
}
