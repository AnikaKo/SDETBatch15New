package class6;

import java.util.Scanner;

public class LogicalOrDemo {
    public static void main(String[] args) {

        System.out.println("Please enter the day");
        Scanner scan=new Scanner(System.in);

        String day = scan.next();

        if (day.equals("Monday") || day.equals(("Friday"))) {
            System.out.println("NO class today");
        } else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            System.out.println("Java class enjoy");
        } else if (day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Manual Testing class");
        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("Review class");
        } else {
            System.out.println("wrong day entered");

      /*  if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase(("Friday"))){
            System.out.println("NO class today");
        }*/
        }
        scan.close();
    }
}
