## MovieTicketManager
MovieTicketManager is a Java program that allows you to manage movie tickets. It provides functionality to create, inquire about movie run dates, and calculate ticket prices.

## Features
Create movie tickets with the movie name, ticket number, theatre number, and ticket price.
Inquire about movie run dates based on the movie name or ticket number.
Calculate tax and total cost for a given ticket price.

## Usage
1. Creating Movie Tickets

To create a movie ticket, you can either provide the details (movie name, ticket number, theatre number, ticket price) during initialization or interactively through the console.

Example:

```
MovieTicket mt1 = new MovieTicket("Die Hard 1", 12345, 4, 5.50);
```

2. Inquiring About Movie Run Dates

You can inquire about movie run dates using the inquireMovieRunDates method, either by providing the movie name or ticket number as an argument.

Example:

```
String runDates1 = mt1.inquireMovieRunDates("Die Hard 1");
String runDates2 = mt1.inquireMovieRunDates(12345);
```

3. Calculating Ticket Price

The program can calculate tax and the total cost for a given ticket price using the TicketPrice class.

Example:

```
TicketPrice.ticketPrice();
```

## Getting Started

1. Clone the repository:

```
git clone https://github.com/your-username/MovieTicketManager.git
```

2. Compile the Java files:


```
javac MovieTicket.java MovieTicketTestHarness.java TicketPrice.java
```

3. Run the program:

```
java MovieTicketTestHarness
```

## License
This project is licensed under the MIT License - see the LICENSE file for details.
