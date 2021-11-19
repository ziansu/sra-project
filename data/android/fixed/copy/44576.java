@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    android.util.Log.d("DEBUG_TAG", "On SingleTapConfirmed OscMode Event!");
    mOscilloscopeFragmentController.butOscModeOnSingleTapConfirmed();
    return super.onSingleTapConfirmed(e);
}