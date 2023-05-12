package StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup>{
    /**
     * Создаем название потока
     */
    private String streamName;
    /**
     * Создаем массив групп студентов
     */
    private List<StudentGroup> studentGroups;
    /**
     * Создем номер группы
     */
    private long groupNumber;
    /**
     * Создаем счетчик групп в потоке
     */
    private int groupCounter;

    /**
     * Конструктор
     * @param streamName - название потока
     * @param groupNumber- номер группы
     */
    public StudentStream(String streamName, long groupNumber){
        this.streamName = streamName;
        this.groupNumber = groupNumber;
        this.studentGroups = new ArrayList<StudentGroup>();
    }

    /**
     * getter
     * @return - возвращает имя потока
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * setter
     * @param streamName- устанавливает имя потока
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * getter
     * @return - возвращает списки групп студентов
     */
    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    /**
     * setter
     * @param studentGroup -возвращает все включенные группы студентов
     */
    public void addStudentGroups(StudentGroup studentGroup) {
        this.studentGroups.add(studentGroup);
        this.groupCounter++;
    }

    /**
     * getter
     * @return- получает номер группы
     */
    public long getGroupNumber() {
        return groupNumber;
    }

    /**
     * setter
     * @param groupNumber - задает нимер группы
     */
    public void setGroupNumber(long groupNumber) {
        this.groupNumber = groupNumber;
    }

    /**
     * Iterator
     * @return
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < studentGroups.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return studentGroups.get(index++);
            }
        };
    }

    /**
     * Переопределение метода toString
     * @return
     */
    @Override
    public String toString() {
        String Description = new String();
        for (StudentGroup studentGroup : studentGroups) {
            Description = String.format("Поток студентов: " + streamName + " включает: " + studentGroup.getStudents() + "\n");
        }
        return Description;
    }}


