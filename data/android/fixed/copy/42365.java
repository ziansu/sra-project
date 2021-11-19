@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState, android.os.PersistableBundle outPersistentState) {
    getSupportFragmentManager().putFragment(outState, hu.tvarga.popularmovies.GridViewActivity.GRID_FRAGMENT_SAVED_INSTANCE_KEY, gridViewFragment);
    super.onSaveInstanceState(outState, outPersistentState);
}