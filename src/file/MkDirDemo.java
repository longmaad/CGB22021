package file;

/**
 * @author longma
 * @create 2022-03-25-14:20
 **/

import java.io.File;

/**
 * directory:目录
 * make：做
 * 注：mkdir是linux中的一条命令。就是make directory的简写，意思是创建目录
 *
 * 使用File创建一个目录
 */
public class MkDirDemo {
    public static void main(String[] args) {


        //在当前目录下新建一个目录：demo
        // File dir = new File("./demo");
       // File dir = new File("demo");
        File dir = new File("./a/b/c/d/e/demo");
        if (dir.exists()) {
              System.out.println("该目录已存在！");
        } else {
//             dir.mkdir();//创建目录时
             dir.mkdirs();
             System.out.println("该目录已创建！");
        }
    }
}
