public void run() {
    mediaPlayerA.release();
    mediaPlayerA = null;
    handler.postDelayed(this, 2000);
    android.widget.Toast.makeText(getApplicationContext(), "Release mediaPlayerA", Toast.LENGTH_LONG).show();
}