package ConstructorFlow.constructortype;

public class EmpEx1 {
    public String name;
    public int age;
    public EmpEx1()
    {
        System.out.println("Zero Argument");
    }

    public EmpEx1(String name)
    {
        System.out.println("One Argument");
        this.name=name;

    }
    public EmpEx1(String name, int age)
    {
        System.out.println("Two Arguments");
        this.name=name;
        this.age=age;

    }

    public static void main(String[] args) {
        EmpEx1 ex1 = new EmpEx1();
        System.out.println(ex1.name +"-"+ex1.age);
        EmpEx1 ex2 = new EmpEx1("Shibaram");
        System.out.println(ex2.name +"-"+ex2.age);
        EmpEx1 ex3 = new EmpEx1("Shibaram",40);
        System.out.println(ex3.name +"-"+ex3.age);

    }
}

