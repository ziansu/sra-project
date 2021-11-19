public void setMovieDesc(final java.lang.String movieDesc) {
    if ((movieDesc == null) || (movieDesc.trim().isEmpty())) {
        throw new java.lang.IllegalArgumentException();
    }
    this.movieDesc = movieDesc;
}