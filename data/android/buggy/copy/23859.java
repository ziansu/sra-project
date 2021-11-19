@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d("MainActivity", "onresume called");
    new com.edsapps.weather.MainActivity.HttpAsyncTask(this, "Fetching forecast").execute();
}