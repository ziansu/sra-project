@java.lang.Override
public void onStop() {
    android.util.Log.e(rocks.throw20.funwithcountries.GameActivityFragment.LOG_TAG, ("onStop " + true));
    cancelGame();
    super.onStop();
}