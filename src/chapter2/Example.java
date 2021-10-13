package chapter2;


import java.sql.SQLOutput;

public class Example {

    public static void main(String[] args) {
        int a = 115 + 5;
        int b;
        b = 20;

        System.out.println(a);
        a = a * 2;
        System.out.print("a=" + a);
        System.out.print(a + a);

        System.out.println("a" + a);
        if (a > b) {
            System.out.print("Mayushik");
        } else {
            System.out.print("Barev erjankutyun");
        } ;

    }
}
