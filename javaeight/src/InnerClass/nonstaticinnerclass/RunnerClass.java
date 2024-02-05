package InnerClass.nonstaticinnerclass;


public class RunnerClass {

    public static void main(String[] args) {

        CompanyClass companyClass = new CompanyClass("BBSR","ABC");
        CompanyClass.EmployeeClass employeeClass = companyClass.new EmployeeClass("BBSR","Dasarathi");
        System.out.println(employeeClass.employeeName);
        System.out.println(employeeClass.employeeLocation);
        System.out.println(companyClass.companyLocation);
        System.out.println(companyClass.companyName);
        System.out.println(CompanyClass.EmployeeClass.employeeCertificate);
        System.out.println(employeeClass);


    }
}
