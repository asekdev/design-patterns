package Iterator;

import java.util.Iterator;

public interface SongIterator {

    //Returns an iterator instance
    //We can return the iterator from each type of Collection (Array, ArrayList, HashTable)
    Iterator createIterator();
    int getDecade();
}
