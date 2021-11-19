@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState, android.os.PersistableBundle outPersistentState) {
    super.onSaveInstanceState(outState, outPersistentState);
    getSupportFragmentManager().putFragment(outState, hu.tvarga.popularmovies.GridViewActivity.GRID_FRAGMENT_SAVED_INSTANCE_KEY, gridViewFragment);
}