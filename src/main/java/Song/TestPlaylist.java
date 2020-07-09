package Song;

public class TestPlaylist {
    public static void main(String[] args) {
        Song song1 = new Song("ulalala", 320);
        Song song2 = new Song("Nothing else matters", 320);
        Song song3 = new Song("Nothing else matters", 250);
        PlayList playList = new PlayList();
        int sum = playList.playlistLenght(song1, song2, song3);
        System.out.println(sum);
        System.out.println(PlayList.getFormattedTime(sum));
    }
}
