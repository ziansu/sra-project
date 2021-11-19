public void viewFish(android.view.View view) {
    android.util.Log.d(com.home.pete.aquarium.MainActivity.TAG, "Viewing my fish");
    setContentView(R.layout.activity_webview);
    startActivity(m_webview);
}