package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author longma
 * @create 2022-03-30-15:24
 **/
public class AutoCloseableDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        try {
            fos =new FileOutputStream("fos.dat");
            fos.write(1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

                if(fos!=null){
                    fos . close();
                }


            }

                /*
                只有实现了java.io.AutoCloseable接口的类才可以在这里定义并初始化
                编译器在编译代码的时候最终会将在这里定义的类在finally中调用close()关闭
                注：最终编译完的样子可以参考FinallyDemo2.java的样子
                 */



    }
}
