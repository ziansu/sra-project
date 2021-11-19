@java.lang.Override
public boolean hasNext() {
    return ((iteratorOffset) < ((length) + (offset))) && (!(com.drmattyg.nanokaraoke.TrackChunk.isTrackChunk(mf, iteratorOffset)));
}