@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    jsonAccessToken = s;
    android.widget.Toast.makeText(this, jsonAccessToken, Toast.LENGTH_SHORT).show();
    checkExistUserAccount();
}