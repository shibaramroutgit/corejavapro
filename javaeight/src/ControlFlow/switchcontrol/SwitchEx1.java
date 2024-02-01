package ControlFlow.switchcontrol;

public class SwitchEx1 {
    public static void main(String[] args) {

        String day = "Friday";
        switch (day)
        {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednessday":
                System.out.println("Wednessday");
                break;
            case "Thrusday":
                System.out.println("Thrusday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "Saturday":
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }
    }
}
