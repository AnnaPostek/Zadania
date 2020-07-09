package KontrolerBiletów;

import java.time.LocalDateTime;

public class TicketController {

    public static void main(String[] args) {
        Passenger[] passengers = new Passenger[6];
        passengers[0] = new Passenger("Ania", "Postek");
        passengers[1] = new Passenger("Ola", "Postek");
        passengers[2] = new Passenger("Jaś", "Postek");
        passengers[3] = new Passenger("Lukasz", "Postek");
        passengers[4] = new Passenger("Paput", "Limek");
        passengers[5] = new Passenger("Paput2", "Blu");

       TicketMachine.buyTicket(passengers[0], 20);
       TicketMachine.buyTicket(passengers[1], 40);

       Ticket inValidTicket = new Ticket(LocalDateTime.now().minusMinutes(20), 15);
       passengers[2].setTicket(inValidTicket);

       Passenger[] passengersWithoutTicket = validateTickets(passengers);
        System.out.println("na gapę jadą:");
        for (Passenger passenger : passengersWithoutTicket) {
            System.out.println(passenger.getName() + " " + passenger.getSurname());
        }
    }

    private static Passenger[] validateTickets(Passenger[] passengers) {
        int passengerWithoutTicket = 0;
        for (Passenger passenger : passengers) {
            Ticket ticket = passenger.getTicket();
            if(ticket==null || !ticket.isValid())
                passengerWithoutTicket++;
        }
        Passenger[] withoutTicket = new Passenger[passengerWithoutTicket];
        for (int i = 0, j = 0; i < passengers.length; i++) {
            Ticket ticket = passengers[i].getTicket();
            if (ticket==null || !ticket.isValid()) {
                withoutTicket[j] = passengers[i];
                j++;
            }
        }
        return withoutTicket;
    }
}
