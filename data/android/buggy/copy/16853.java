public int compareTo(net.sourceforge.subsonic.domain.MusicIndex.SortableArtist artist) {
    return sortableName.compareToIgnoreCase(artist.sortableName);
}