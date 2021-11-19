public void getAllUsers() {
    android.util.Log.i(LOG_TAG, "Requesting all users");
    if (connected) {
        out.println("getAllUsers");
        return ;
    }else {
        android.util.Log.e(LOG_TAG, "getAllUsers() failed!");
    }
}