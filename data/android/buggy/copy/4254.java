@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    ((com.leaf.clips.model.AbsBeaconReceiverManager) (informationManager)).stopService();
    informationManager = null;
}