@java.lang.Override
protected void onResume() {
    android.util.Log.v("here", "resuming");
    super.onResume();
    new com.jumboeats.kate.jumboeats.MainActivity.GetData().execute();
}