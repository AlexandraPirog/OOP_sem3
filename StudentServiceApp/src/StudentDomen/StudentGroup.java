package StudentDomen;

import java.util.Iterator;
import java.util.List;
//import java.util.Spliterator;

public class StudentGroup implements Iterable<Student> {
    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }
}
