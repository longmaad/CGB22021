package file;

import java.io.File;
import java.io.IOException;

/**
 * @author longma
 * @create 2022-03-25-11:46
 **/
/*
创建文件的前提是该文件所在目录必须存在，如果目录不存在则创建时
java
 */
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        //在当前项目1目录下新建一个文件：test。txt
        File file = new File("./test.txt");
        //boolean exists()判断file对应路径是否存在该文件或目录
        if(file.exists()){
            //存在
            System.out.println("该文件已存在");
        }else {
            //不存在
            file.createNewFile();
        }

    }
}
