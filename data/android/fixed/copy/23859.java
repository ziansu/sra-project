@java.lang.Override
public void onResume() {
    super.onResume();
    new com.edsapps.weather.MainActivity.HttpAsyncTask(this, "Fetching forecast").execute();
}