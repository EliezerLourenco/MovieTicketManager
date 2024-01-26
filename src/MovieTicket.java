public class MovieTicket {
   private String movieName;
   private int ticketNumber;
   private int theatreNumber;
   private static double ticketPrice = 11.45;

   // Default constructor
   public MovieTicket() {
   }

   // Parameterized constructor
   public MovieTicket(String movieName, int ticketNumber, int theatreNumber, double ticketPrice) {
      this.movieName = movieName;
      this.ticketNumber = ticketNumber;
      this.theatreNumber = theatreNumber;
      this.ticketPrice = ticketPrice;
   }

   // Getter and Setter methods for movieName, ticketNumber, and theatreNumber

   public void setMovieName(String movieName) {
      this.movieName = movieName;
   }

   public String getMovieName() {
      return movieName;
   }

   public void setTicketNumber(int ticketNumber) {
      this.ticketNumber = ticketNumber;
   }

   public int getTicketNumber() {
      return ticketNumber;
   }

   public void setTheatreNumber(int theatreNumber) {
      this.theatreNumber = theatreNumber;
   }

   public int getTheatreNumber() {
      return theatreNumber;
   }

   public void setTicketPrice(double ticketPrice) {
      this.ticketPrice = ticketPrice;
   }

   //receive the ticket price
   public double getTicketPrice() {
      return ticketPrice;
   }

   // Method to calculate tax
   public static double calculateTax() {
      return ticketPrice * 0.13;
   }
}
