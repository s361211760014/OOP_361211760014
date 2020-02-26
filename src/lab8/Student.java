package lab8;

public class Student extends Person {
    //คลาส Student สืบทอดจากคลาส Person
    private String stdID;
    private String program;

    public Student(String id, String name,
                   String stdID,String program) {
        //Super () เป็นการเรียกใช้งาน Constructor ของ Super class
        super(id, name);
        this.stdID = stdID;
        this.program = program;
    }
    //getter and setter

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    //toString

    @Override
    public String toString() {
        return "Student{" +
                "stdID='" + stdID + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}