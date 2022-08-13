import java.text.NumberFormat;
import java.util.Scanner;

public class Project_MortgageCalculator {
    public static void main(String[] args){
        double principal, annual, years;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        principal= scanner.nextDouble();
        System.out.print("Annual Interest Rate: ");
        annual = scanner.nextDouble();
        System.out.print("Period (Years): ");
        years = scanner.nextDouble();

        double monthly = (annual / 100) / 12;
        double months = years * 12;

        double mortgage = principal * ((monthly * Math.pow(1+monthly,months)) / (Math.pow(1+monthly,months) - 1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String answer = currency.format(mortgage);

        System.out.println("Mortgage: " + answer);

    }
}
