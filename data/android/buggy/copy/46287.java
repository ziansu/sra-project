public void setMovies(java.util.ArrayList<com.execube.genesis.model.Movie> listOfMovies) {
    mMovies = listOfMovies;
    notifyItemRangeChanged(0, listOfMovies.size());
    notifyDataSetChanged();
}