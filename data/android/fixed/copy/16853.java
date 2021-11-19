public int compareTo(net.sourceforge.subsonic.domain.MusicIndex.SortableArtist artist) {
    int n = sortableName.compareToIgnoreCase(artist.sortableName);
    return n == 0 ? sortableName.compareTo(artist.sortableName) : n;
}