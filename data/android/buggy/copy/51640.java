public static app.anish.com.tapp.shared_prefs.TappSharedPreferences getInstance() {
    if ((app.anish.com.tapp.shared_prefs.TappSharedPreferences.tappSharedPreferences) == null) {
        throw new java.lang.RuntimeException("Need to call init before getting an instance of TappSharedPreferences");
    }
    return app.anish.com.tapp.shared_prefs.TappSharedPreferences.tappSharedPreferences;
}