package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Create the decade objects
        SongIterator songs90s = new SongsOf90s();
        SongIterator songs80s = new SongsOf80s();

        List<SongIterator> listOfDecades = new ArrayList<>();
        listOfDecades.add(songs80s);
        listOfDecades.add(songs90s);

        DiskJockey dj = new DiskJockey(listOfDecades);

        dj.showTheSongs();

    }
}
