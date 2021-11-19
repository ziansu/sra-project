@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putBoolean("hasLoaded", true);
    outState.putBoolean("hasInitializedFirstFragment", mHasInitializedFirstFragment);
}