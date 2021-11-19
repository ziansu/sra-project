@java.lang.Override
public boolean onDown(android.view.MotionEvent event) {
    android.util.Log.d(com.vitaminbacon.lockscreendialer.LockScreenActivity.MyGestureListener.TAG, ("onDown is " + (event.getY())));
    return true;
}