protected void onPostExecute(int responseCode) {
    if ((responseCode < 200) || (responseCode > 300)) {
        android.widget.Toast.makeText(context, "fail", Toast.LENGTH_LONG).show();
    }
}