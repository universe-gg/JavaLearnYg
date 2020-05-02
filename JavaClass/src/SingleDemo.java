/**
 * @author yguo
 * @date 2020/5/2 21:40
 */
public class SingleDemo {
    private String name;
    private static final SingleDemo sd = new SingleDemo();

    private SingleDemo() {
        System.out.println("... SingleDemo.SingleDemo()");
        this.name = "张三";
    }

    public static SingleDemo getSingleDemo() {
        System.out.println("... SingleDemo.getSingleDemo()");
        return sd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void println() {
        System.out.println("name = " + this.name);
    }
}