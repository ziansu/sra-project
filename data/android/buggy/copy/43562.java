@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
    android.util.Log.d("DEBUG_TAG", "On Longpress OscMode Event!");
    mOscilloscopeFragmentController.butOscModeOnLongPress();
    butOscMode.setBackgroundColor(2201331);
    super.onLongPress(e);
}