package Song;

public class Song {
    private String title;
    private int timeDuration;

    public Song(String title, int timeDuration) {
        this.title = title;
        this.timeDuration = timeDuration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(int timeDuration) {
        this.timeDuration = timeDuration;
    }
}
