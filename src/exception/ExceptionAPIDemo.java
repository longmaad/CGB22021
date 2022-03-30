package exception;

/**
 * @author longma
 * @create 2022-03-30-17:17
 **/
public class ExceptionAPIDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try{
            String str = "abc";
            System.out.println(Integer.parseInt(str));
        }catch (Exception e){
            e.printStackTrace();
            //获取错误消息，一般用于提示给用户或者记录日志的时候用
            String message = e.getMessage();
            System.out.println(message);
            System.out.println("出错了,正在解决...");
        }
        System.out.println("程序结束了");
    }
}
