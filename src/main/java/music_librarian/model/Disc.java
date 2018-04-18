package music_librarian.model;

import java.net.URL;
import java.util.List;

public class Disc {
    private List<Pan> pans;
    private String title;
    private String releasedAt;
    private List<Info> info;
    private URL jacketUrl;
    private List<Track> tracks;

    public List<Pan> getPans() {
        return pans;
    }

    public String getTitle() {
        return title;
    }

    public String getReleasedAt() {
        return releasedAt;
    }

    public List<Info> getInfo() {
        return info;
    }

    public URL getJacketUrl() {
        return jacketUrl;
    }

    public List<Track> getTracks() {
        return tracks;
    }
}
