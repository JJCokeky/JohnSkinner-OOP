// John Skinner
// 2024-02-23
// Object- oriented programing

package InClass2;

public class Student { // class
    private String name;
    private Integer rolnum;

    // invokes no argument constructor
    public Student() {
        name = "Skinner";
        rolnum = 100930325;
    }

    // parameterized constructor
    public Student(String sname, int srolnum) {
        name = sname;
        rolnum = srolnum;
    }

    // setter method
    public String Setinfo(String sname, int srolnum) { // method
        String name = sname;
        Integer rolnum = srolnum;
        return name + rolnum;
    }

    // My display function
    public void Getinfo() {
        System.out.println("Student name is: " + name);
        System.out.println("roll number is: " + rolnum);
        // getinfo does not need a return becasue its a printing method
    }
}