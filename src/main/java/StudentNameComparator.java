package main.java;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return ((String)student1.getName()).compareTo(student2.getName());
    }
}
