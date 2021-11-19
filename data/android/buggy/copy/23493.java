@java.lang.Override
public void onClick(android.view.View v) {
    toggleMovieFavorite((mMovie.getIsFavorite(getActivity()) ? true : false));
}