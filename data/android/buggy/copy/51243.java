@java.lang.Override
public void onUDPReceive(at.android.smartrobot.network.UDPReceiveEvent e) {
    timeReceiveAcknowlage = e.getTimestamp();
    android.util.Log.d(at.android.smartrobotapp.activities.SmartActivity.TAG, ("ACK: " + (timeReceiveAcknowlage)));
}