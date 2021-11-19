public void onDestroy() {
    android.widget.Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    super.onDestroy();
}