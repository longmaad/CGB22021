package Work;

import java.io.*;
import java.util.Scanner;

/**
 * @author longma
 * @create 2022-03-29-21:31
 **/
public class Test08 {
    public static void main(String[] args) throws IOException {
        System.out.println("要复制的路径");
        String f=new Scanner(System.in).nextLine();
        File from = new File(f);
        System.out.println("复制到路径");
        String t = new Scanner(System.in).nextLine();
        File to = new File(t);
        zFb(from,to);
    }

    private static <b> void zFb(File from, File to) throws IOException {
       try{
           BufferedReader in = new BufferedReader(new FileReader(from));
        BufferedWriter out = new BufferedWriter(new FileWriter(to));

        int b=0;
        while((b=in.read())!=-1) {
            out.write(b);
            }
       }catch(IOException e){
           System.out.println(e);
        return;

        }

    }
}
