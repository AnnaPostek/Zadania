package Kontroler;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {
    private LocalDateTime currentTime;
    private int experienceDurationTicket;

    public Ticket(LocalDateTime currentTime, int experienceDurationTicket) {
        this.currentTime = currentTime;
        this.experienceDurationTicket = experienceDurationTicket;
    }

    public LocalDateTime getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(LocalDateTime currentTime) {
        this.currentTime = currentTime;
    }

    public int getExperienceDurationTicket() {
        return experienceDurationTicket;
    }

    public void setExperienceDurationTicket(int experienceDurationTicket) {
        this.experienceDurationTicket = experienceDurationTicket;
    }
    public boolean isValid() {
        LocalDateTime ldt = LocalDateTime.now();
        Duration duration = Duration.between(currentTime, ldt);
        return duration.toMinutes()<experienceDurationTicket;
    }
}
