public void onDestroy() {
    request = null;
    super.onDestroy();
    android.util.Log.d("BugWithService:ServiceDestroy", "ServiceDestroy");
}