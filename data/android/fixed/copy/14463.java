@java.lang.Override
public void onGlobalLayout() {
    if (hasMeasure) {
        setTabCurPosition(positionBeforeMeasure, positionBeforeMeasureIsSmooth);
        removeGlobalLayoutListener(getViewTreeObserver(), this);
    }
}