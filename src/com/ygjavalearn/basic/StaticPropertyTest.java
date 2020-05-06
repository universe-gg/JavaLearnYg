package com.ygjavalearn.basic;

import com.ygjavalearn.basic.Person;

/**
 * @author yguo
 * @date 2020/5/2 16:50
 */
public class StaticPropertyTest {
    static {
        System.out.println("...in StaticPropertyTest. 静态代码段被调用~");
    }

    public static void main(String[] args) {
        System.out.println("...StaticPropertyTest.main()");
        Person p1 = new Person("张三","1998-01-01");
        p1.println();

        Person p2 = new Person("李四","1999-01-01");
        p2.println();

        Person p3 = new Person("王五","2000-01-01");
        p3.println();

        p3.setNationality("美国");
        p1.println();
        p2.println();
        p3.println();
//        System.out.println("instanceCount = " + Person.getInstanceCount());
    }
}
