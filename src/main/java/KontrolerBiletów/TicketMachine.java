package KontrolerBiletów;

import java.time.LocalDateTime;

public class TicketMachine {
    public static void buyTicket(Passenger passenger, int timeTicketDuration) {
        Ticket ticket = new Ticket(LocalDateTime.now(), timeTicketDuration);
        passenger.setTicket(ticket);
    }
}
