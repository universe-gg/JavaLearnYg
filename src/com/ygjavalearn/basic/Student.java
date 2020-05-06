package com.ygjavalearn.basic;

import com.ygjavalearn.basic.Person;

/**
 * @author yguo
 * @date 2020/5/2 22:29
 */
public class Student extends Person {
    private String school;

    public Student() {
        super();
        System.out.println("... Student.Student()");
    }

    public Student(String name, String birthday, String school) {
        super(name,birthday);
        this.school = school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return this.school;
    }

    public String toString() {
        return super.toString() + "school = " + this.school + "\n";
    }
}
