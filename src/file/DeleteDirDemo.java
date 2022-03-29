package file;

/**
 * @author longma
 * @create 2022-03-25-14:43
 **/

import java.io.File;

/**
 * 删除一个目录
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        //将当前目录下的demo目录删除
       // File dir = new File("demo");
        File dir = new File("a");
        if(dir.exists()){
            dir.delete();//只能删除空文件
            System.out.println("该目录已删除！");
        }else {
           System.out.println("该目录不存在！");
        }
    }
}
