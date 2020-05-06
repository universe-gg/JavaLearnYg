/**
 * @author yguo
 * @date 2020/5/2 15:27
 */
package com.ygjavalearn.basic;

public class ClassTest2 {
    public static void main(String[] args) {
        System.out.println("...ClassTest2.main()");

        System.out.println("----------------1");
        Person p1 = new Person("guoguo","2020-05-02");
        System.out.println(p1);

        System.out.println("----------------2");
        Person p2 = new Person();
        p2.setName("yguo");
        p2.setBirthday("2020-05-01");
        System.out.println(p2);

        System.out.println("----------------3");
        p2 = p1;
        System.out.println(p2);

        System.out.println("----------------4");
        changeName(p1);
        System.out.println(p1);

        System.out.println("----------------5");
        System.out.println(p2);
    }

    private static void changeName(Person p) {
        System.out.println("...ClassTest2.changeName()");
        System.out.println(p);

        System.out.println("----------------");
        p.setName("who");
        System.out.println(p);
    }
}
