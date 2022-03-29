package file;

import java.io.File;

/**
 * @author longma
 * @create 2022-03-25-14:08
 **/
/*
delete:删除
删除一个文件
 */

public class DeleteFileDemo {
    public static void main(String[] args) {
        //将当前目录下的test.txt文件删除
       // File file = new File("./adc/test.txt");
        //"./"在相对路径中可以忽略不写的，默认就是从"./"开始的
        File file = new File("test.txt");
        if(file.exists()){
            file.delete();
            System.out.println("该文件已删除！");
        }else {
            System.out.println("该文件不存在！");
        }

    }
}
