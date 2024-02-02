package ObjectSorting.sortbycomparator;

import ObjectSorting.sortbycomparable.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.age-o2.age;
    }
}
