package class6;

public class IncrementOperator {
    public static void main(String[] args) {

        int number=10;
        number=number+1;
        System.out.println(number);

        number+=1;
        System.out.println(number);

        number++;  // also incremenr the number by 1
        System.out.println(number);

        int number2=10;
        number2--; // decrements the value for one
        System.out.println(number2);

        int number3=0;
        while(true){
            System.out.println("Hello world");
            number3++;
        }
    }
}
