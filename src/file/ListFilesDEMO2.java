package file;

/**
 * @author longma
 * @create 2022-03-25-15:31
 **/

import java.io.File;
import java.io.FileFilter;

/**
 * filter:过滤器
 * accept:接受
 * contains:包含
 * 有条件的获取一个目录中的子项
 *
 * File有一个重载的listFiles方法，允许我们传入一个文件过滤器，并在该过滤器上定义过滤条件，
 * 之后listDiles执行完毕会将目录中所有满足过滤器要求的子项进行返回
 */
public class ListFilesDEMO2 {
    public static void main(String[] args) {
        //获取当前目录中名字含有字母"o"的子项
        File e = new File(".");
        if(e.isDirectory()){
            FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File file) {
                    System.out.println("正在过滤："+file.getName());
                    return file.getName().contains("o");
                }
            };
            File[] subs = e.listFiles(filter);
            System.out.println("共"+subs.length+"个子项");

            for(int i=0;i<subs.length;i++){
                File sub = subs[i];
                System.out.println(sub.getName());
            }

        }
    }
}

