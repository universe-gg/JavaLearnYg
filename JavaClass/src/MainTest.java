import java.util.Arrays;

/**
 * @author yguo
 * @date 2020/5/2 19:31
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println("...MainTest.main()");
        System.out.println("args = " + Arrays.deepToString(args));

        if(args.length < 2) {
            System.out.println("输入的参数个数错误！");
            System.exit(1);
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i +"] = " + args[i]);
        }
    }
}
