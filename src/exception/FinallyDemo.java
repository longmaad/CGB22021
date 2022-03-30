package exception;

/**
 * @author longma
 * @create 2022-03-30-14:29
 **/
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始...");
        try{
            String line = null;
            System.out.println(line.length());
            System.out.println("!!!!!");
        }catch (Exception e){
            System.out.println("出错了！");
        }finally {
            System.out.println("finally中的代码执行了！");
        }
        System.out.println("程序结束了");
    }
}
