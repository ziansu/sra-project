private void subscribeToPushService() {
    com.google.firebase.messaging.FirebaseMessaging.getInstance().subscribeToTopic("Test");
    android.util.Log.d("AndroidBash", "Subscribed");
    java.lang.String token = com.google.firebase.iid.FirebaseInstanceId.getInstance().getToken();
    android.util.Log.d("AndroidBash", token);
}