private void checkNullSession() {
    android.content.SharedPreferences prefs = this.getSharedPreferences("Sessions", com.mobshep.shepherdlogin.MODE_PRIVATE);
    java.lang.String sessionId = prefs.getString("sessionId", null);
    if (sessionId == null) {
        this.finishActivity(0);
    }
}