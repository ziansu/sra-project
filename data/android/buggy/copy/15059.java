@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent e) {
    android.util.Log.d(se.anotherhermit.voxels.GLESView.MyGestureListener.DEBUG_TAG, "onDoubleTap");
    se.anotherhermit.voxels.GLESView.doubleTap();
    android.widget.Toast.makeText(getContext(), "Switched View", Toast.LENGTH_SHORT).show();
    return super.onDoubleTap(e);
}