package com.ygjavalearn.basic;
import java.util.Arrays;

/**
 * @author yguo
 * @date 2020/5/3 7:57
 */

public class ExceptionTest1 {
    public static void main(String[] args) {
        System.out.println("... ExceptionTest1.main()");

        try {
            int arr[] = new int[]{1,2,3,4,5};
            System.out.println("arr[7] = " + arr[7]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("数组超出绑定范围！");
            System.out.println("异常信息：" + e);
        }
        finally {
            System.out.println("这里的代码一定被执行！");
        }

        System.out.println("main 方法结束。");
    }
}
