public void onFinish() {
    es.carlosrolindez.kbfinder.SelectBtActivity.service.stop();
    es.carlosrolindez.kbfinder.SelectBtActivity.i2dpDisconnectionTimerStarted = false;
    android.util.Log.e(es.carlosrolindez.kbfinder.SelectBtActivity.TAG, "stop after i2dConnection");
    es.carlosrolindez.kbfinder.A2dpService.connectBluetoothA2dp(es.carlosrolindez.kbfinder.SelectBtActivity.mContext, es.carlosrolindez.kbfinder.SelectBtActivity.deviceMAC);
    es.carlosrolindez.kbfinder.SelectBtActivity.service.start();
}