public java.util.List<ch.hearc.ig.odi.moviemanager.business.Movie> getMoviesList() {
    try {
        return new java.util.ArrayList(movies.values());
    } catch (java.lang.NullPointerException ex) {
        return new java.util.ArrayList();
    }
}