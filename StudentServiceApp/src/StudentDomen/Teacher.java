package StudentDomen;

public class Teacher extends User{
    private String field;
    public Teacher(String firstName, String secondName, int age, String field) {
        super(firstName, secondName, age);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
    @Override
    public String toString(){
        return"User{"+
                "First Name: " +super.getFirstName()+
                ", Second Name: " + super.getSecondName() +
                ", Age: " + super.getAge() +
                ", Field: " + getField() +
                '}';
    }
}
