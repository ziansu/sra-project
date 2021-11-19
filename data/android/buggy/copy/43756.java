@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent event) {
    if ((pickedObject) != (selectedObject)) {
        toggleSelection();
    }
    edit();
    return true;
}