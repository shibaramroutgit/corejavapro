package ControlFlow.ifcontrol;

public class IfElseEx1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        if(a<=10) {
            System.out.println(a);
        }else {
            System.out.println("a Is bigger than 10");
        }


        if(b>10)
        {
            System.out.println("b is bigger than 10 ");
        } else if (b>8) {
            System.out.println("b is bigger than 8 ");
        } else if (b>5) {
            System.out.println("b is bigger than 5 ");
        }else
        {
            System.out.println("b is less than 5 ");
        }

    }
}
