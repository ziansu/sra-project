protected void onPostExecute(java.lang.String file_url) {
    if (file_url != null) {
        android.widget.Toast.makeText(this, file_url, Toast.LENGTH_LONG).show();
    }
}