private void handleStartApp(android.content.Intent intent) {
    android.os.Bundle bundle = intent.getExtras();
    mPendingIntent = ((android.app.PendingIntent) (bundle.get("PendingIntent")));
    if ((dbConditionFences) != null) {
    }
}