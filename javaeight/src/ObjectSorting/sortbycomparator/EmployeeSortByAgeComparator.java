package ObjectSorting.sortbycomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortByAgeComparator {
    public static void main(String[] args) {
        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(new Employee("Shiba",40));
        employeesList.add(new Employee("Arabinda",20));
        employeesList.add(new Employee("Sayam",30));
        employeesList.add(new Employee("Deepak",34));
        employeesList.add(new Employee("Gopal",18));

        Collections.sort(employeesList, new AgeComparator());
        for (Employee  e:employeesList) {
            System.out.println(e.age +"-"+e.name);
        }

    }
}
