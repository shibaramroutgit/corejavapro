package InnerClass.staticinnerclass;

public class SchoolClass {

    public static String schoolCertificate;
    public  String schoolName;
    public String schoolLocation;

    public SchoolClass(String schoollocation,String schoolname)
    {
        this.schoolName=schoolname;
        this.schoolLocation=schoollocation;
    }

    static class StudentClass{
        public static String studentCertificate;
        public  String studentName;
        public String studentLocation;
        public StudentClass(String studentLocation, String studentName)
        {
            this.studentLocation=studentLocation;
            this.studentName=studentName;
            System.out.println("schoolCertificate");
        }

    }

}
