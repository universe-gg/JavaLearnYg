package com.ygjavalearn.basic;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @author yguo
 * @date 2020/5/3 8:50
 */
public class SystemTest1 {
    public static void main(String[] args) {
        System.out.println("... SystemTest1.main()");

        Properties ps = System.getProperties();
        Enumeration en = ps.propertyNames();
        while(en.hasMoreElements()) {
            String key = (String)en.nextElement();
            System.out.println(key + " = " + ps.getProperty(key));
        }
    }
}
