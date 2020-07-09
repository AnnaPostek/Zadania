package KontrolerBiletów;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
   private LocalDateTime ticket;
    private int expire;

    public Ticket(LocalDateTime ticket, int expire) {
        this.ticket = ticket;
        this.expire = expire;
    }

    public LocalDateTime getTicket() {
        return ticket;
    }

    public void setTicket(LocalDateTime ticket) {
        this.ticket = ticket;
    }

    public int getExpire() {
        return expire;
    }

    public void setExpire(int expire) {
        this.expire = expire;
    }

    public boolean isValid(){
        LocalDateTime localDateTime = LocalDateTime.now();
        Duration duration = Duration.between(ticket, localDateTime);
         return duration.toMinutes()<expire;
        }
    }
