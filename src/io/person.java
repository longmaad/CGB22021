package io;

/**
 * @author longma
 * @create 2022-03-29-10:20
 **/

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * 使用当前类实例测试对象流的序列化与反序列化操作
 */
public class person implements Serializable {
    /*
    实现序列化接口后最好主动定义序列化版本号这个常量。
    这样一来对象序列化时就不会根据类的结构生成一个版本号，而是使用该固定值。
    那么反序列化时，只要还原的对象和当前类的版本号一致就可以进行还原。
     */
   public static final long serialVersionUID = 1L;

    private String name;           //姓名
        private int age;               //年龄
        private String gender;         //性别
    /*
    当一个属性被关键字transient修饰后，那么当进行对象序列化时，该属性值会忽略。
    忽略不必要的属性可以达到对象瘦身的目的，减少资源开销。
     */
        private transient String[] otherInfo;    //其他信息
    //java bean
    public  person(){}

    public person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return age == person.age && name.equals(person.name) && gender.equals(person.gender) && Arrays.equals(otherInfo, person.otherInfo);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age, gender);
        result = 31 * result + Arrays.hashCode(otherInfo);
        return result;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}
