package class4;

public class IfDemo1 {
    public static void main(String[] args) {
        int money = 15000;
        if (money > 1000) {
            System.out.println("Lets buy an Iphone");
        }
        if (money > 2000) {
            System.out.println("Lets also buy a Macbook");
        }
        boolean mothersDay = true;
        if (mothersDay) {
            System.out.println("Happy Mother's day");
        }
        String name = "Sardar";
// equals method is only used for non-primitives
        if (name.equals("Sardar")) {
            System.out.println("I love football");
        }

    }
}
