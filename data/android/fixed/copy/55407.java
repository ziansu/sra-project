@java.lang.Override
public void onStartListening() {
    net.oldev.aBrightnessQS.PLog.d("Start listening");
    mTileUpdater.run();
}