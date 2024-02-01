package ControlFlow.continuecontrol;

public class whileEx3 {
    public static void main(String[] args) {
        int num=0;
        while (num<=10)
        {
            if(num%2==0) // To print only odd number
            {
                num++;
                continue;
            }
            System.out.println(num);
            num++;



        }
    }
}
