@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    android.util.Log.e(edu.nthu.nmsl.itri_app.FragmentActivity.TAG, ("Restore " + (savedInstanceState.getInt(CurrentFragementTAG_KEY))));
    this.currentFragementIndex = savedInstanceState.getInt(CurrentFragementTAG_KEY);
}