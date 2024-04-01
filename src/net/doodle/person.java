package net.doodle;

public class person {

    public String fname;
    public String lname;
    public int age;
    public int ssn;

    public person(String fname, String lname, int age, int ssn) {

        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.ssn = ssn;

    }

    public String getName(){
        String name = fname + " " + lname;
        return name;
    }
}
