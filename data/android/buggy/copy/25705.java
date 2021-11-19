public java.util.List<java.lang.String> getGenres() {
    return java.util.Collections.unmodifiableList(java.util.Arrays.asList(genres.split(com.jonasgerdes.schauburgr.model.Movie.STRING_LIST_SEPERATOR)));
}