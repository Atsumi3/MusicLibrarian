package music_librarian.model;

import java.util.List;

public class Track {
    private int idx;
    private String title;
    private List<String> artists;
    private List<String> original;

    public int getIdx() {
        return idx;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getArtists() {
        return artists;
    }

    public List<String> getOriginal() {
        return original;
    }
}