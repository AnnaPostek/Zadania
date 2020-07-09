package Song;

import java.time.Duration;

public class PlayList {
    private static final int SECONDS_IN_HOUR = 60 * 60;
    private static final int SECONDS_IN_MINUTE = 60;

    public int playlistLenght(Song... songs) {
        int sum = 0;
        for (Song song : songs) {
            sum+=song.getTimeDuration();
        }
        return sum;
    }

//    public static String getFormattedTime(int seconds) {
//int hour = seconds/SECONDS_IN_HOUR;
//seconds=seconds%SECONDS_IN_HOUR;
//int min = seconds/SECONDS_IN_MINUTE;
//        seconds = seconds%SECONDS_IN_MINUTE;
//        String hoursPart = timeToString(hour);
//        String minutespart = timeToString(min);
//String secoundPart = timeToString(seconds);
//return hoursPart + ":" + minutespart + ":" + secoundPart;
//    }

    private static String timeToString(int hours) {
        String time;
        if (hours ==0) {
            time = "00";
        } else if (hours<10) {
            time = "0" + hours;
        } else {
           time=Integer.toString(hours);
        }
        return time;
    }
    public static String getFormattedTime(int secound) {
        Duration duration = Duration.ofSeconds(secound);
        int hour = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        secound=duration.toSecondsPart();
        String hoursPart = timeToString(hour);
        String minutesPart = timeToString(minutes);
        String secoundPart = timeToString(secound);
        return hoursPart +":"+ minutesPart + ":" + secoundPart;
    }
}
