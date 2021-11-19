@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putSerializable(com.ratik.popularmovies.ui.MainActivity.MOVIES_DATA, movies);
}