package ConstructorFlow.constructormodifier;

public class EmpEx2 {
    public String name;
    public int age;
    public String location;
    public double pay;


    public EmpEx2(String name)
    {
        System.out.println("Public");
        this.name=name;

    }
    protected EmpEx2(String name, int age)
    {
        System.out.println("Protected");
        this.name=name;
        this.age=age;

    }
    EmpEx2(String name, int age, double pay)
    {
        System.out.println("default<>");
        this.name=name;
        this.age=age;
        this.pay=pay;

    }
    private EmpEx2(String name, int age,double pay, String location)
    {
        System.out.println("Private");
        this.name=name;
        this.age=age;
        this.pay=pay;
        this.location=location;

    }

    public static void main(String[] args) {

        EmpEx2 empEx2private = new EmpEx2("Shibaram",40,68990.40,"BBSR");
        System.out.println(empEx2private.age+"-"+empEx2private.location+"-"+empEx2private.pay+"-"+empEx2private.name);

        EmpEx2 empEx2default = new EmpEx2("Shibaram",40,68990.40);
        System.out.println(empEx2default.age+"-"+empEx2private.pay+"-"+empEx2private.name);

        EmpEx2 empEx2protected = new EmpEx2("Shibaram",40);
        System.out.println(empEx2protected.age+"-"+empEx2protected.name);

        EmpEx2 empEx2public = new EmpEx2("Shibaram");
        System.out.println(empEx2public.name);



    }
}

