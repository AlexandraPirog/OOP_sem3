package StudentDomen;

public class Student extends User implements Comparable<Student>{
    private long studentID;
    public Student(String firstName, String secondName, int age, long studentID) {
        super(firstName, secondName, age);
        this.studentID = studentID;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString(){
        return"User{"+
                "First Name: " +super.getFirstName()+
                ", Second Name: " + super.getSecondName() +
                ", Age: " + super.getAge() +
                ", Student ID: " + getStudentID() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(super.getAge()==o.getAge()){
            return 0;
        }
        if(super.getAge()<o.getAge()){
            return -1;
        }
        return 1;
    }
}
