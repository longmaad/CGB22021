package file;

/**
 * @author longma
 * @create 2022-03-25-16:13
 **/

import java.io.File;
import java.io.FileFilter;

/**
 * 获取./src/file目录下所有名字以"D"开头的子项
 */
public class Test {
    public static void main(String[] args) {
        File f = new File("./src/file");
        if(f.isDirectory()){
            FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File file) {
                    String name = new String();
                    System.out.println("正在过滤："+name);
                    return name.startsWith("D");
                }
            };
            File[] subs = f.listFiles(filter);
            System.out.println("共"+subs.length+"个子项");

            for(int i=0;i<subs.length;i++){
                File sub = subs[i];
                System.out.println(sub.getName());
            }
        }
    }
}
