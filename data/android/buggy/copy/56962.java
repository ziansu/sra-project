@java.lang.Override
protected void onPreExecute() {
    android.util.Log.d("preexe", "edit schedule start");
    super.onPreExecute();
    mProgress.setVisibility(View.VISIBLE);
}