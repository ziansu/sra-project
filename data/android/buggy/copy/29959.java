public void onTick(long millisUntilFinished) {
    android.util.Log.i("COUNTTIME::", ("" + millisUntilFinished));
    broadcastToUI(millisUntilFinished);
}