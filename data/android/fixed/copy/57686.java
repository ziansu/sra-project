@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putParcelable(com.example.vit.popularmovies.ui.fragment.MoviesGridFragment.KEY_MOVIES_LIST, org.parceler.Parcels.wrap(moviesList));
}