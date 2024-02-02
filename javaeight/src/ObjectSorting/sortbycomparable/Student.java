package ObjectSorting.sortbycomparable;

public class Student implements Comparable<Student>{
    public String name;
    public int age;

    public Student(String name, int age)
    {
        this.age=age;
        this.name=name;
    }

    @Override
    public int compareTo(Student o) {
       //for Int Value
        //return this.age -o.age;
       // for String Value
        return this.name.compareTo(o.name);

    }
}
