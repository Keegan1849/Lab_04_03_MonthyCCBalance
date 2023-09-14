public class Main {
    public static void main(String[] args) {
        double balance = 5000.0;
        double monthOne = 0.0;
        double monthTwo = 0.0;
        double total = 0.0;

        monthOne = balance * .17;
        total = monthOne + balance;
        monthTwo = total * .17;




        System.out.println("The interest for the first month is " + monthOne);
        System.out.println("The interest for the second month is " + monthTwo);
    }
}