@java.lang.Override
public void onResume() {
    super.onResume();
    fi.aalto.trafficsense.trafficsense.ui.BroadcastHelper.broadcastViewResumed(mLocalBroadcastManager, true);
    fi.aalto.trafficsense.trafficsense.ui.BroadcastHelper.simpleBroadcast(mLocalBroadcastManager, InternalBroadcasts.KEY_MAIN_ACTIVITY_REQ);
    checkLocationPermission();
}