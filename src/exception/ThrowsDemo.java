package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author longma
 * @create 2022-03-30-16:45
 **/

/**
 * 子类重写超类含有的throws声明异常抛出的方法时，对throws的重写规则
 */
public class ThrowsDemo {
    public void dosome()throws IOException, AWTException{
    }
}
class SubClass extends ThrowDemo{
//    public void dosome()throws IOException, AWTException{}

      //允许仅抛出部分异常
//    public void dosome()throws IOException{}
    //允许抛出任何异常
//    public void dosome(){}
    //允许抛出超类方法抛出异常的子类型异常
//    public void dosome()throws FileNotFoundException{}
    //不允许抛出额外异常：超类没有的，且没有继承关系的
//    public void dosome()throws SQLException{}
    //不允许抛出超类方法抛出异常的超类型异常
    public void dosome()throws Exception{}

}