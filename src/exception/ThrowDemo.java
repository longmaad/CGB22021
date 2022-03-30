package exception;

/**
 * @author longma
 * @create 2022-03-30-15:51
 **/

/**
 * 异常的抛出
 * throw关键字可以主动对外抛出一个异常
 * 通常：
 * 1：程序出现异常，但是该异常不应当在当前代码块中被解决时，可以主动将其抛出去
 * 2：程序可以运行，但是已不满足业务场景要求时可以当作异常抛出去
 */
public class ThrowDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("程序开始了");

        Person p = new Person();
        //满足语法但是不满足业务场景
        try {
             /*
            当我们使用调用一个含有throws声明异常抛出的方法时，编译器要求我们必须处理
            这个异常，否则编译不通过
            处理异常的方法有两种:
            1:使用try-catch主动捕获

             */
            p.setAge(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("此人年龄："+p.getAge());

        System.out.println("程序结束了");
    }
}
