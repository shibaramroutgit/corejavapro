package OutPackage.constructorout;

import ConstructorFlow.constructormodifier.EmpEx2;

public class EmpEx3 {
    public static void main(String[] args)
    {
        EmpEx2 ex1 = new EmpEx2("Shibaram"); // Public access outside package
        //EmpEx2 ex2 = new EmpEx2("Shibaram",40); // Not access outside package as it is Protected

        //EmpEx2 ex3 = new EmpEx2("Shibaram",40,68990.40); // Not access outside package as it is default

        //EmpEx2 empEx2private = new EmpEx2("Shibaram",40,68990.40,"BBSR"); // Not access outside package as it is private



    }
}
