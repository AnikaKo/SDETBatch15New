package class7;

public class ForLoops1 {
    public static void main(String[] args) {
        //print odd number from 1-20
        for (int i = 0; i<20 ; i++) {
            if (i%2!=0){
                System.out.println(i);
            }

        }

        for (int i = 1; i <20 ; i=i+1) { // i=i+1 ili moze da se napise i+=2
            System.out.println(i);
        } // this one is faster ,bcs it skips even numbers
    }     // first one is checking if a number is odd
}
