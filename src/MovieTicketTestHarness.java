import java.util.Scanner;

public class MovieTicketTestHarness {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        // Create a MovieTicket object with initial values
        MovieTicket mt1 = new MovieTicket("Die Hard 1", 12345, 4, 5.50);

        // Display details of the first MovieTicket object
        System.out.println("Movie Name: " + mt1.getMovieName());
        System.out.println("Ticket Number: " + mt1.getTicketNumber());
        System.out.println("Theatre Number: " + mt1.getTheatreNumber());
        System.out.println("Ticket Price: " + mt1.getTicketPrice()); // This method is missing

        // Create an empty MovieTicket object
        MovieTicket mt2 = new MovieTicket();
        Scanner in = new Scanner(System.in);

        // Prompt the user to provide details for the second MovieTicket object
        System.out.println("Please provide the Movie Name.");
        String movieName = in.nextLine();
        System.out.println("Please provide the Ticket Number.");
        int ticketNumber = in.nextInt();
        System.out.println("Please provide the Theatre Number.");
        int theatreNumber = in.nextInt();
        System.out.println("Please provide the Ticket Price.");
        double ticketPrice = in.nextDouble();
        in.nextLine(); // Consume newline character

        // Set the details for the second MovieTicket object
        mt2.setMovieName(movieName);
        mt2.setTicketNumber(ticketNumber);
        mt2.setTheatreNumber(theatreNumber);
        mt2.setTicketPrice(ticketPrice); // This method is missing

        // Display details of the second MovieTicket object
        System.out.println("Movie Name: " + mt2.getMovieName());
        System.out.println("Ticket Number: " + mt2.getTicketNumber());
        System.out.println("Theatre Number: " + mt2.getTheatreNumber());
        System.out.println("Ticket Price: " + mt2.getTicketPrice()); // This method is missing

        // It would be helpful to add comments explaining the purpose of each section
    }
}
