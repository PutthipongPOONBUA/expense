package SE;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        people h = new people("Putthipong","Poonbua");
        Account h2 = new Account(200);
        Scanner scan = new Scanner(System.in);
        System.out.println(h.toString());

        System.out.println("Your income = ");
        float a = scan.nextFloat();
        System.out.println("Your balance = " + h2.income(a));

        System.out.println("Outcome = ");
        float b =  scan.nextFloat();
        System.out.println("Your outcome = "+ h2.expense(b));


    }
}
