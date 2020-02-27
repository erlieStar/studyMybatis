package com.javashitang.part5;

import com.javashitang.part5.pojo.Person;
import com.javashitang.part5.pojo.Student;
import org.apache.ibatis.reflection.Reflector;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.junit.Test;

import java.util.Arrays;

public class MybatisReflectTest {

    @Test
    public void objectFactoryTest() {
        ObjectFactory objectFactory = new DefaultObjectFactory();
        // 通过默认构造函数创建对象
        Person person1 = objectFactory.create(Person.class);
        // Person{age=0, height=0}
        System.out.println(person1);
        // 通过指定构造函数创建对象
        Person person2 = objectFactory.create(Person.class,
                Arrays.<Class<?>>asList(int.class, int.class), Arrays.<Object>asList(1, 1));
        // Person{age=1, height=1}
        System.out.println(person2);
    }

    @Test
    public void reflectorTest() {
        Reflector reflector = new Reflector(Student.class);
        String[] getablePropertyNames = reflector.getGetablePropertyNames();
        String[] setablePropertyNames = reflector.getSetablePropertyNames();
        // [idCardNum, age, height]
        System.out.println(Arrays.toString(getablePropertyNames));
        // [idCardNum, age, height]
        System.out.println(Arrays.toString(setablePropertyNames));
    }
}
