private android.content.SharedPreferences getSharedPreferences() {
    return com.jana.android.core.app.AbstractApplication.getApplication().getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
}