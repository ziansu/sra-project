@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if ((downPosition) >= 0) {
        openAnimate(downPosition);
    }
    return false;
}