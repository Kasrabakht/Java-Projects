package Java.L4.Homework3;

public class Student <Name,Id,Fathername>{
    private Name name;
    private Id studentid;
    private Fathername fathername;

    public void setName(Name name) {
        this.name = name;
    }

    public void setStudentid(Id studentid) {
        this.studentid = studentid;
    }

    public void setFathername(Fathername fathername) {
        this.fathername = fathername;
    }

    public Name getName() {
        return name;
    }

    public Id getStudentid() {
        return studentid;
    }

    public Fathername getFathername() {
        return fathername;
    }
}
