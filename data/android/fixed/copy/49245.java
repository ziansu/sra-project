static final android.content.Context getApplicationContextIfAvailable(android.content.Context context) {
    return android.app.ActivityThread.currentApplication().getApplicationContext();
}