@java.lang.Override
public void onShutterDone(int requestId) {
    com.fezrestia.android.viewfinderanywhere.control.OverlayViewFinderController.getInstance().getCurrentState().onShutterDone();
    com.fezrestia.android.viewfinderanywhere.ViewFinderAnywhereApplication.getGlobalFirebaseAnalyticsController().createNewLogRequest().setEvent(ViewFinderAnywhereConstants.FIREBASE_EVENT_ON_SHUTTER_DONE).done();
}