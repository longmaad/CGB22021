package file;

import java.io.File;

/**
 * @author longma
 * @create 2022-03-25-15:08
 **/
public class ListFilesDemo {
    public static void main(String[] args) {
        //查看当前目录下的所有子项
       // File dir = new File(".");//当前目录
        File dir = new File("./src/file");//当前目录
        /*
        判断当前File表示的是否为一个文件
        boolean isFile();
        判断当前file表示的是否为一个目录
        boolean isDirectory();

         */
        //File[] listFiles()//返回当前目录中的所有子项，每个子项都包含在返回的数组中作为一个元素
        if(dir.isDirectory()){
            File[] subs = dir.listFiles();
            System.out.println("当前目录中共有包含"+subs.length+"个子项");

               for(int i=0;i<subs.length;i++){
                   File sub = subs[i];
                   System.out.println(sub.getName());

               }

        }
    }
}
