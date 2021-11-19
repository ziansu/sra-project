public void updateSortMethod(java.lang.String sortMethod) {
    this.sortMethod = sortMethod;
    mGridMovieposterAdapter.clear();
    updateMovies(1);
}