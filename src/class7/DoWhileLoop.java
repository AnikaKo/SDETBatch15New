package class7;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Please enter a number:");
            number = scanner.nextInt();
        } while (number != 5);

int number2=0;

while(number2!=5){
    System.out.println("please enter a number:");
    number2=scanner.nextInt();
}
    }
}
