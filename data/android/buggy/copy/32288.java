@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    android.util.Log.d("BackEnd", ("On method onTouch " + event));
    return clickDetector.onTouchEvent(event);
}