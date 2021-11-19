@java.lang.Override
public void onGameMessageReceived(java.lang.String playerId, org.json.JSONObject message) {
    android.util.Log.d(com.example.mirko.custombuttonexample.miniGameFragments.ShakeMinigame.TAG, ("onGameMessageReceived: " + message));
    if (message.has("startGame")) {
        mSensorManager.registerListener(mShakeDetector, mAccelerometer, SensorManager.SENSOR_DELAY_GAME);
    }
}