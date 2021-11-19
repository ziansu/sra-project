public void onCreate() {
    super.onCreate();
    android.content.Context context = getApplicationContext();
    com.colossaldb.dnd.prefs.AppPreferences.initialize(context);
}