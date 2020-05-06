/**
 * @author yguo
 * @date 2020/5/3 9:16
 */

package com.ygjavalearn.basic;

import java.util.Calendar;

public class CatlendarTest1 {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
        //打印当前时间
        System.out.println(cl.get(cl.YEAR) + "-" + cl.get(cl.MONTH) + "-" + cl.get(cl.DAY_OF_MONTH) +" " + cl.get(cl.HOUR) + ":" + cl.get(cl.MINUTE) + ":" + cl.get(cl.SECOND));
        cl.add(cl.DAY_OF_YEAR,230);
        System.out.println(cl.get(cl.YEAR) + "-" + cl.get(cl.MONTH) + "-" + cl.get(cl.DAY_OF_MONTH) +" " + cl.get(cl.HOUR) + ":" + cl.get(cl.MINUTE) + ":" + cl.get(cl.SECOND));
    }
}
