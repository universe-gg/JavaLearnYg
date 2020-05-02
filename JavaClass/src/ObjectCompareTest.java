/**
 * @author yguo
 * @date 2020/5/2 16:22
 */
public class ObjectCompareTest {
    public static void main(String[] args) {
        System.out.println("...ObjectCompareTest.main()");

        Person p1 = new Person("guoguo","2020-05-01");
        System.out.println(p1);

        System.out.println("----------------1");
        Person p2 = new Person();
        System.out.println(p2);

        if(p1 == p2) {
            System.out.println("p1 == p2");
        }
        else {
            System.out.println("p1 != p2");
        }

        System.out.println("----------------2");
        Person p3 = p1;

        if(p3 == p1) {
            System.out.println("p1 == p3");
        }
        else {
            System.out.println("p1 != p23");
        }

        if(p1.equals(p2)) {
            System.out.println("p1 is equals p2)");
        }
        else {
            System.out.println("p1 is not equals p2)");
        }

        if(p1.equals(p3)) {
            System.out.println("p1 is equals p3)");
        }
        else {
            System.out.println("p1 is not equals p3)");
        }

    }
}
