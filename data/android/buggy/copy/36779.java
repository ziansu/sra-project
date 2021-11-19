@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    android.widget.Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    super.onPostExecute(s);
}