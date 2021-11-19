@java.lang.Override
public void messageReceived(de.mhid.android.timerecordingforpebble.PebbleMessenger msgr, com.getpebble.android.kit.util.PebbleDictionary dict) {
    evtRequestStatus(true, firstTimelineUpdate, false);
    firstTimelineUpdate = false;
}