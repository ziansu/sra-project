@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    outState.putSerializable(com.ratik.popularmovies.ui.MainActivity.MOVIES_DATA, movies);
}