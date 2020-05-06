package com.ygjavalearn.basic;

import com.ygjavalearn.basic.SingleDemo;

/**
 * @author yguo
 * @date 2020/5/2 21:33
 */

public class SingleDemoTest {
    public static void main(String[] args) {
        System.out.println("... SingleDemoTest.main()");
        SingleDemo s = SingleDemo.getSingleDemo();
        System.out.println("name = " + s.getName());
    }
}
