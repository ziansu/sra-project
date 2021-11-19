@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((caldroidFragment) != null) {
        caldroidFragment.saveStatesToKey(outState, "CALDROID_SAVED_STATE");
    }
}