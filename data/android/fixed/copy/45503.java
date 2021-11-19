public void setMovies(java.util.ArrayList<net.nanodegree.popularmovies.model.Movie> movies) {
    if (movies != null)
        setListAdapter(new net.nanodegree.popularmovies.adapters.GridPostersAdapter(getActivity(), R.layout.movie_grid_item, movies));
    
}