package class6;

public class WhileLoop7 {
    public static void main(String[] args) {

        int number = 0;

        while (number < 10) {
            if (number % 2 == 0) {
                System.out.println("Even " + number);
            }
            number++;
        }
    }
}
