package Work;

import java.io.*;
import java.util.Scanner;

/**
 * @author longma
 * @create 2022-03-29-20:23
 **/
public class Test05 {
    public static void main(String[] args) throws IOException{
        System.out.println("要复制的路径");
        String f=new  Scanner(System.in).nextLine();
        File from = new File(f);
        System.out.println("复制到路径");
        String t = new Scanner(System.in).nextLine();
        File to = new File(t);
        zfCopy(from,to);
    }

    private static void zfCopy(File from, File to) throws IOException {
        InputStream in = new FileInputStream(from);
        FileOutputStream out = new FileOutputStream(to);
        int b=0;
        while ((b=in.read())!=-1){
            out.write(b);
        }
        in.close();
        out.close();
    }
}
