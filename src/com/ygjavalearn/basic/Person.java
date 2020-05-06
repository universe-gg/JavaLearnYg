package com.ygjavalearn.basic;

/**
 * @author yguo
 * @date 2020/5/2 14:45
 */
public class Person {
    private String name;
    private String birthday;
    private static String nationality = "中国";
    private static int instanceCout = 0;

    static {
        System.out.println("... in Person. 静态代码段被调用~");
    }

    public Person() {
        System.out.println("... Person.Person()");
        instanceCout++;
        System.out.println("name = " + this.name);
        System.out.println("birthday = " + this.birthday);
    }

    public Person(String name, String birthday) {
        System.out.println("... Person.Person(" + name + ", " + birthday + ")");
        instanceCout++;
        this.name = name;
        this.birthday = birthday;

        System.out.println("name = " + name);
        System.out.println("birthday = " + birthday);
    }

    public String getBirthday() {
        System.out.println("... Person.getBirthday()");
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        System.out.println("... Person.setBirthday(" + birthday + ")");
        this.birthday = birthday;
    }

    public String getName() {
        System.out.println("... Person.getName()");
        return this.name;
    }

    public void setName(String name) {
        System.out.println("... Person.setName(" + name + ")");
        this.name = name;
    }

    public static String getNationality() {
        System.out.println("... Person.getNationality()");
        return Person.nationality;
    }

    public static void setNationality(String nationality) {
        System.out.println("... Person.setNationality()");
        Person.nationality = nationality;
    }

    public static int getInstanceCount() {
        System.out.println("... Person.getInstanceCount()");
        return Person.instanceCout;
    }

    public static void setInstanceCout(int instanceCout) {
        System.out.println("... Person.setInstanceCout()");
        Person.instanceCout = instanceCout;
    }

    @Override
    public String toString() {
        System.out.println("... Person.toString()");
        StringBuffer strb = new StringBuffer("name = " + this.name + "\n");
        strb.append("birthday = " + this.birthday + "\n");
        strb.append("nationality = " + Person.nationality + "\n");
        strb.append("instanceCount = " + Person.instanceCout + "\n");
        String s = super.toString() + "\n" +  strb.toString();
        return s;
    }

    public boolean equals(Object o) {
        System.out.println("... Person.equals()");
        boolean flag = false;
        if(o instanceof Person) {
            Person p = (Person)o;
            if(this.name.equals(p.getName()) && this.birthday.equals(p.getBirthday())) {
                flag = true;
            }
        }
        return flag;
    }

    public void println() {
        System.out.println("...Person.println()");
        System.out.println("name = " + this.name);
        System.out.println("birthday = " + this.birthday);
        System.out.println("nationality = " + Person.nationality);
        System.out.println("instanceCout = " + Person.instanceCout);
    }

}
