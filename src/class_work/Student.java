package class_work;

public class Student {
    private final String name;
    private final String lastName;
    private final String middleName;
    private int mark;

    public Student(String name, String lastName, String middleName, int mark){
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.mark = mark;
    }

    public String getFIO(){
        return lastName + " " + name + " " + middleName;
    }

    public int getMark() {
        return mark;
    }
}
