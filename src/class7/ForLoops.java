package class7;

public class ForLoops {
    public static void main(String[] args) {
  /*
  print number from 0 to 9
   */
        int number =0;
        while(number<=9){  //check the condition if the condition is true execute the code in the bodyof while loop
            System.out.println(number); //prints the value of number on the console
            number++;  // it adds one to the number variable
        }
/*
(initialize; condition; incrementORdecrement)
 */
        for (int i=0; i<10; i++ ){
            System.out.println(i);
        }
    }
}
