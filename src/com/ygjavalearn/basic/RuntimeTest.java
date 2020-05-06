package com.ygjavalearn.basic;

/**
 * @author yguo
 * @date 2020/5/3 8:59
 */
public class RuntimeTest {
    public static void main(String[] args) {
        System.out.println("... RuntimeTest.main()");

        Runtime run = Runtime.getRuntime();
        try {
            Process p = run.exec("notepad.exe");
            System.out.println("-------------睡眠5秒-------------");
            Thread.sleep(5000);  //睡眠5秒
            System.out.println("p = " + p);
            p.destroyForcibly();  //关闭程序
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
