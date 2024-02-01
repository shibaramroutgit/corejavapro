package ControlFlow.breakcontrol;

public class whileEx2 {

    public static void main(String[] args) {
        int a=1;
        while (a<=10)
        {
            System.out.println(a);
            a++;
            if(a>=6) {
                System.out.println("6 time loop , so i am breaking it");
                break;
            }

        }
    }
}
