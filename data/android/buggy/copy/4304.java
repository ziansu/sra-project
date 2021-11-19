public void onSwipeLeft() {
    android.util.Log.d(com.lyk.ai_2048.main.MainGameActivity.TAG, "swiped left");
    numberGrid.saveState();
    numberGrid.moveLeft();
}