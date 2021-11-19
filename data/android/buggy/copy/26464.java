@java.lang.Override
protected final void onPostExecute(java.lang.Boolean success) {
    super.onPostExecute(success);
    mProgress.setVisibility(View.INVISIBLE);
    if (success) {
        android.util.Log.d("postexe", "edit schedule complete");
    }
}