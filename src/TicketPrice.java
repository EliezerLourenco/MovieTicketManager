import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the ticket price: ");
        double ticketPrice = input.nextDouble();

        double tax = ticketPrice * 0.13;
        System.out.println("The amount of tax is $" + (int) (tax * 100) / 100.0);
        System.out.println("The total cost is $" + (tax + ticketPrice));
    }
}
