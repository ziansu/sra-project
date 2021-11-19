public java.lang.String getFullArtist() {
    if ((fullartist) == null) {
        fullartist = ((subartist) != null) ? ((artist) + " ") + (subartist) : artist;
    }
    return fullartist;
}