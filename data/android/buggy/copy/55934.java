protected void onPostExecute(java.lang.Void result) {
    updateFragments();
    android.widget.Toast.makeText(getApplicationContext(), "Allotment created", Toast.LENGTH_SHORT).show();
}