package Kontroler;

import java.time.LocalDateTime;

public class TicketController {
    public static void main(String[] args) {
        Passenger[] passengers = new Passenger[5];
        passengers[0] = new Passenger("Henryk", "Rzutek");
        passengers[1] = new Passenger("Hania", "Kłopotek");
        passengers[2] = new Passenger("Zdziś", "Psiur");
        passengers[3] = new Passenger("Krzysiu", "Siatka");
        passengers[4] = new Passenger("Zosia", "Wyraźna");

        TicketMachine.buyTicket(passengers[0], 15);
        TicketMachine.buyTicket(passengers[1], 20);
        Ticket ticketValid = new Ticket(LocalDateTime.now().minusMinutes(20), 15);
        Ticket ticketInValid = new Ticket(LocalDateTime.now().minusMinutes(20), 25);
        passengers[2].setTicket(ticketValid);
        passengers[3].setTicket(ticketInValid);

        Passenger[] passengerWithoutTicket = getPassengerWithoutTicket(passengers);
        System.out.println("na gapę jadą:");
        for (Passenger passenger : passengerWithoutTicket) {
            System.out.println(passenger.getName() + " " + passenger.getSurname());
        }
    }

    private static Passenger[] getPassengerWithoutTicket(Passenger[] passengers) {
        int passengerWithoutTicket = 0;
        for (Passenger passenger : passengers) {
            Ticket ticket = passenger.getTicket();
            if (ticket == null || !ticket.isValid())
                passengerWithoutTicket++;
        }
        Passenger[] withoutTicket = new Passenger[passengerWithoutTicket];
        for (int i = 0, j = 0; i < passengers.length; i++) {
            Ticket ticket2 = passengers[i].getTicket();
            if (ticket2 == null || !ticket2.isValid()) {
                withoutTicket[j] = passengers[i];
                j++;
            }
        }
        return withoutTicket;
    }
}
