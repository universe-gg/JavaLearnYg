/**
 * @author yguo
 * @date 2020/5/2 14:12
 */
package com.ygjavalearn.basic;

public class ClassTest1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("guoguo","1981-01-22");
        System.out.println(p1);
        System.out.println(p2);

        p1 = p2;
        System.out.println(p1);
    }
}
