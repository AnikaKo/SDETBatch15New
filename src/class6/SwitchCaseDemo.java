package class6;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String country = input.nextLine();
        System.out.println(country.toLowerCase());


        switch (country.toLowerCase()) { // converts the text to lowercase USA=>usa
            case "usa":
                System.out.println("Burgers");
                break;
            case "Italy":
                System.out.println("Pasta");
                break;
            case "afganistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("wrong country");
        }

    }
}
