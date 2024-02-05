package OutPackage.constructorout;

import ConstructorFlow.constructormodifier.EmpEx2;

public class SubClassEmpEx2 extends EmpEx2 {

    public SubClassEmpEx2(String name) {
        super(name);
    }

    protected SubClassEmpEx2(String name, int age) {
        super(name, age);
    }

    public SubClassEmpEx2(String name, int age,String location) {
        super(name, age);
    }

    public static void main(String[] args) {
        SubClassEmpEx2 sub1 = new SubClassEmpEx2("Shibaram");
        System.out.println(sub1.name);
        SubClassEmpEx2 sub2 = new SubClassEmpEx2("Shibaram",40);
        System.out.println(sub2.name+"-"+sub2.age);

    }
}
