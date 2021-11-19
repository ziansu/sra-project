private void sendRefreshRequest() {
    android.content.Intent serviceIntent = new android.content.Intent(com.scottlindley.mobliezombie.MainActivity.REQUEST_REFRESH_INTENT);
    sendBroadcast(serviceIntent);
    android.content.Intent fragmentIntent = new android.content.Intent(com.scottlindley.mobliezombie.MainActivity.ACTIVITY_TO_FRAGMENT_REFRESH);
    sendBroadcast(fragmentIntent);
}