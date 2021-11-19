public void checkInternetConnection() {
    if (!(it.jaschke.alexandria.MainActivity.isNetworkAvailable(this))) {
        android.widget.Toast.makeText(this, R.string.noNetwork_connection, Toast.LENGTH_SHORT).show();
    }
}