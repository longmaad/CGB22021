package Lambda;

/**
 * @author longma
 * @create 2022-03-25-17:09
 **/

import java.io.File;
import java.io.FileFilter;

/**
 * JDK8之后java推出了一个特性：lambda表达式
 * lambda可以使得程序员面向函数式编程
 *
 * 直观感受，可以用更精简的语法创建匿名内部类
 * 但是lambda创建匿名内部类
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //匿名内部类写法
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                System.out.println("正在过滤："+file.getName());
                return file.getName().contains("o");
            }
        };
        //lambda表达式写法（就是省去了接口名和方法名
        FileFilter filter1= (File file)->{
            return file.getName().contains("o");
        };
        //参数类型可以忽略不写，如果只有一个参数时，参数列表的"()"可以忽略不写
        FileFilter filter2 = file->{
            return file.getName().contains("o");
        };
        //当方法体中只函一句话时，方法体的"{}"可以忽略，并且如果含有return时要一同忽略
        FileFilter filter3 = file->file.getName().contains("o");
        int sum = 1;
        for(int i=0;i<10;i++){
            i++;
            sum+=i;
        }
        System.out.println(sum);
    }
}
