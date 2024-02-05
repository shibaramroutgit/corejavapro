package InnerClass.staticinnerclass;

public class RunnerClass {

    public static void main(String[] args) {
        SchoolClass.StudentClass studentClass = new SchoolClass.StudentClass("BBSR","Deepak");
        SchoolClass schoolClass = new SchoolClass("BBSR","OSAPHighSchool");
        System.out.println(studentClass.studentLocation);
        System.out.println(studentClass.studentName);
        System.out.println(schoolClass.schoolLocation);
        System.out.println(schoolClass.schoolName);
        System.out.println(SchoolClass.StudentClass.studentCertificate);



    }
}
