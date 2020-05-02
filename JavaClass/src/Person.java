/**
 * @author yguo
 * @date 2020/5/2 14:45
 */
public class Person {
    private String name;
    private String birthday;

    public Person() {
        System.out.println("Person.Person()");
        System.out.println("name = " + name);
        System.out.println("birthday = " + birthday);
    }

    public Person(String name, String birthday) {
        System.out.println("Person.Person(" + name + ", " + birthday + ")");

        this.name = name;
        this.birthday = birthday;

        System.out.println("name = " + name);
        System.out.println("birthday = " + birthday);
    }

    public String getBirthday() {
        System.out.println("Person.getBirthday");
        return birthday;
    }

    public void setBirthday(String birthday) {
        System.out.println("Person.setBirthday");
        this.birthday = birthday;
    }

    public String getName() {
        System.out.println("Person.getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("Person.setName");
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.println("Person.toString");
        StringBuffer strb = new StringBuffer("name = " + this.name + "\n");
        strb.append("birthday = " + this.birthday + "\n");
        String s = super.toString() + "\n" +  strb.toString();
        return s;
    }

    public void println() {
        System.out.println("name = " + name);
        System.out.println("birthday = " + birthday);
    }

}
