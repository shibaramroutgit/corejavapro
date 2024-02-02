package ControlFlow.foreachcontrol;


import java.util.ArrayList;
import java.util.List;

public class ForEachEx1 {
    public static void main(String[] args) {
        List<String> userName = new ArrayList<>();
        userName.add("Shibaam");
        userName.add("Dasarathi");
        userName.add("Sarata");
        userName.add("Sibani");
        userName.add("Hemanta");
        for (String s:userName) {
            System.out.println(s);
        }
    }
}
