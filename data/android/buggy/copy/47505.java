@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    try {
        player.stop();
        player.release();
    } catch (java.lang.Exception e) {
        android.widget.Toast.makeText(this, "Didnt stop", Toast.LENGTH_SHORT).show();
    }
}