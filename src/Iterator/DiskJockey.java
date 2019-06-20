package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DiskJockey {

    // create a list of SongIterator's
    //composition
    List<SongIterator> discs = new ArrayList<SongIterator>();

    public DiskJockey(List<SongIterator> songDecades) {

        for(SongIterator s : songDecades) {
            this.discs.add(s);
        }
    }

    // Now that I can treat everything as an Iterator it cleans up
    // the code while allowing me to treat all collections as 1
    public void showTheSongs(){

        for(SongIterator it : this.discs) {
            int songInfoYear = it.getDecade();
            Iterator decade = it.createIterator();

            System.out.println("Songs of the " + songInfoYear + "'s");
            printTheSongs(decade);
        }
    }

    //The parameter will be our createIterator interface method
    //It'll provide each Collection as an iterator
    private void printTheSongs(Iterator iterator){

        while(iterator.hasNext()){

            SongInfo songInfo = (SongInfo) iterator.next();

            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased() + "\n");
        }
    }
}
