package InnerClass.nonstaticinnerclass;

public class CompanyClass {

    public static String companyCertificate;
    public  String companyName;
    public String companyLocation;

    public CompanyClass(String companyLocation, String companyName)
    {
        this.companyName=companyName;
        this.companyLocation=companyLocation;
    }

    class EmployeeClass{
        public static String employeeCertificate;
        public  String employeeName;
        public String employeeLocation;
        public EmployeeClass(String employeeLocation, String employeeName)
        {
            this.employeeLocation=employeeLocation;
            this.employeeName=employeeName;
            System.out.println("schoolCertificate");
        }

    }

}
