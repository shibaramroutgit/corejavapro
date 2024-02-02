package ObjectSorting.sortbycomparable;

import java.util.ArrayList;
import java.util.List;

public class StudentObjectNoSortEx1 {
    public static void main(String[] args)
    {
        Student[] studentsArray = new Student[5];
        studentsArray[0] = new Student("Shiba",40);
        studentsArray[1] = new Student("Arabinda",20);
        studentsArray[2] = new Student("Sayam",30);
        studentsArray[3] = new Student("Deepak",34);
        studentsArray[4] = new Student("Gopal",18);

        List<Student> studentsList = new ArrayList<Student>();
        studentsList.add(new Student("Shiba",40));
        studentsList.add(new Student("Arabinda",20));
        studentsList.add(new Student("Sayam",30));
        studentsList.add(new Student("Deepak",34));
        studentsList.add(new Student("Gopal",18));

        System.out.println("Print As Default added into Array");
        for (Student s:studentsArray) {
            System.out.println(s.age +"-"+s.name);
        }

        System.out.println("Print As Default added into List");
        for (Student s:studentsList) {
            System.out.println(s.age +"-"+s.name);
        }


    }
}
