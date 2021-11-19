@java.lang.Override
public void onPause() {
    android.util.Log.d(com.csci448.goldenrush.networkingpal.NewEventActivity.TAG, "onPause() called");
    super.onPause();
    com.csci448.goldenrush.networkingpal.EventLab.get(this).updateEvent(mEvent);
}