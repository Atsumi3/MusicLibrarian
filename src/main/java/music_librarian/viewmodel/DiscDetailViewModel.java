package music_librarian.viewmodel;

import music_librarian.model.Disc;
import music_librarian.model.Info;
import music_librarian.model.Pan;
import music_librarian.model.Track;

import java.util.Collections;
import java.util.List;

public class DiscDetailViewModel {

    private final Disc mDisc;

    public DiscDetailViewModel(Disc disc) {
        mDisc = disc;
    }

    public List<Pan> getPans() {
        if (mDisc.getPans() == null) {
            return Collections.emptyList();
        }
        return mDisc.getPans();
    }

    public String getTitle() {
        return mDisc.getTitle() != null ? mDisc.getTitle() : "";
    }

    public String getJacketUrl() {
        return mDisc.getJacketUrl() != null ? mDisc.getJacketUrl().toString() : "";
    }

    public List<Info> getInfo() {
        if (mDisc.getInfo() == null) {
            return Collections.emptyList();
        }
        return mDisc.getInfo();
    }

    public List<Track> getTracks() {
        if (mDisc.getTracks() == null) {
            return Collections.emptyList();
        }
        return mDisc.getTracks();
    }
}
