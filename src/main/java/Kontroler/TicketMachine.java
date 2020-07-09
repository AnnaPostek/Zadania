package Kontroler;

import java.time.Duration;
import java.time.LocalDateTime;

public class TicketMachine {
   public static void buyTicket(Passenger passenger, int duration){
       Ticket ticket = new Ticket(LocalDateTime.now(),duration);
       passenger.setTicket(ticket);


   }
}
