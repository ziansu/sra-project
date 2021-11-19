@java.lang.Override
public void onStartListening() {
    net.oldev.aBrightnessQS.PLog.d("Start listening");
    mBrightnessMgr = new net.oldev.aBrightnessQS.BrightnessManager(getApplicationContext());
    mTileUpdater.run();
}