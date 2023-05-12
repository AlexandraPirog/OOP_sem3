import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentStream;
import StudentDomen.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Sergey", "Ivanov", 25);
        //System.out.println(u1);
        Student s1 = new Student("Kate", "Popovski", 23, 1);
        Student s2 = new Student("Leonid", "Pochkovski", 22, 2);
        Student s3 = new Student("Kirill", "Sidorov", 24, 3);
        Student s4 = new Student("Arkady", "Zelenov", 22, 4);
        Student s5 = new Student("Lena", "Popova", 23, 5);
        Student s6 = new Student("Askold", "Rurikovich", 24, 6);
        Student s7 = new Student("Petr","Petin", 22,7);
        Student s8 = new Student("Leonid","Moskvin", 21, 8);
        Student s9 = new Student("Teos","Protein", 24,9);
        Student s10 = new Student("Clubnika","Berry", 22,10);
        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        List<Student> listStud2 =new ArrayList<Student>();
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);
        List<Student> listStud3 =new ArrayList<Student>();
        listStud3.add(s7);
        listStud3.add(s8);
        listStud3.add(s9);
        listStud3.add(s10);
        StudentGroup group1 = new StudentGroup(listStud);
        StudentGroup group2 = new StudentGroup(listStud2);
        StudentGroup group3 = new StudentGroup(listStud3);

        StudentStream c1 = new StudentStream("Criminalistics",101);
        c1.addStudentGroups(group1);
        c1.addStudentGroups(group2);
        c1.addStudentGroups(group3);
        System.out.println(c1);

//        StudentStream c1 = new StudentStream(listStud);

//        StudentStream c2 = new StudentStream(listStud2,2);
//        StudentStream c3 = new StudentStream(listStud3,3);


//        for (Student student : group){
//            System.out.println(student);
//        }
//        System.out.println(group);
//        System.out.println("--------------после сортировки----------------");
//
//
//        Collections.sort(group.getStudents());
//        for (Student student : group){
//            System.out.println(student);
//        }
//        System.out.println(group);
//    }
}}