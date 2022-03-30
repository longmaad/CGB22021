package exception;

/**
 * @author longma
 * @create 2022-03-30-17:33
 **/

/**
 * 自定义异常
 * 通常用于那些满足语法但是不满足业务场景时的错误。
 * 自定义异常要做到如下操作：
 * 1：类名要做到见名知意
 * 2：要继承
 */
public class IllegalAgeException  extends Exception{
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
