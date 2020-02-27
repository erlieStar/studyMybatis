package com.javashitang.part5;

import com.javashitang.part5.pojo.Person;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {


    /**
     * 获得Class对象有如下三种方式
     * 1.使用Class.forName(String clazzName) 传入类的全限定名
     * 2.通过类的class属性
     * 3.调用对象的getClass()方法
     */
    @Test
    public void getClassObject() throws Exception {
        Class<?> personClass1 = Class.forName("com.javashitang.part5.pojo.Person");
        Class<?> personClass2 = Person.class;
        Person person = new Person();
        Class<?> personClass3 = person.getClass();
        Assert.assertEquals(personClass1, personClass2);
        Assert.assertEquals(personClass2, personClass3);
    }

    /**
     * 1.通过无参构造函数创建对象
     * 2.通过指定构造函数创建对象
     */
    @Test
    public void reflectClass() throws Exception {
        Class<?> personClass1 = Class.forName("com.javashitang.part5.pojo.Person");
        Person person1 = (Person) personClass1.newInstance();
        System.out.println(person1);

        Class<?> personClass2 = Class.forName("com.javashitang.part5.pojo.Person");
        Constructor<?> defaultConstructor = personClass2.getDeclaredConstructor(int.class, int.class);
        // 如果指定构造函数是私有的可以加上语句
        // defaultConstructor.setAccessible(true);
        Person person2 = (Person) defaultConstructor.newInstance(1, 1);
        System.out.println(person2);
    }


    /**
     * 调用方法
     */
    @Test
    public void reflectMethod() throws Exception {
        Class<?> personClass1 = Class.forName("com.javashitang.part5.pojo.Person");
        Method toStringMethod = personClass1.getDeclaredMethod("toString");
        // 如果方法是私有的，可以加上如下语句
        // toStringMethod.setAccessible(true);
        Object person = personClass1.newInstance();
        String tip = (String) toStringMethod.invoke(person);
        System.out.println(tip);
    }


    /**
     * 设置字段
     */
    @Test
    public void reflectField() throws Exception {
        Class<?> personClass1 = Class.forName("com.javashitang.part5.pojo.Person");
        Field ageField = personClass1.getDeclaredField("age");
        ageField.setAccessible(true);
        Object person = personClass1.newInstance();
        ageField.setInt(person, 10);
        System.out.println(person);
        int age = (int)ageField.get(person);
        System.out.println(age);
    }


}
