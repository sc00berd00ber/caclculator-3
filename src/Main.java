import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Monthly Payout (no commas) ($): ");
        double monthlyPayout = input.nextDouble();

        System.out.println("Enter Expected Interest Rate (e.x 7.65): ");
        double interestRate = input.nextDouble() / 100;

        System.out.println("Enter Years to Pay Out: ");
        int years = input.nextInt();

        double monthlyInterestRate = interestRate / 12;
        int months = years * 12;

        double pv = monthlyPayout * (1 - Math.pow(1 + monthlyInterestRate, -months)) / monthlyInterestRate;

        System.out.println("Present Value: \n" + currency.format(pv));

    }
}