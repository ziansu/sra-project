public static app.anish.com.tapp.shared_prefs.TappSharedPreferences getInstance(android.content.Context context) {
    if ((app.anish.com.tapp.shared_prefs.TappSharedPreferences.tappSharedPreferences) == null) {
        app.anish.com.tapp.shared_prefs.TappSharedPreferences.tappSharedPreferences = new app.anish.com.tapp.shared_prefs.TappSharedPreferences(context);
    }
    return app.anish.com.tapp.shared_prefs.TappSharedPreferences.tappSharedPreferences;
}