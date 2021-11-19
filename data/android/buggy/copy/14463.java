@java.lang.Override
public void onGlobalLayout() {
    if ((hasMeasure) && ((positionBeforeMeasure) != (-1))) {
        setTabCurPosition(positionBeforeMeasure, positionBeforeMeasureIsSmooth);
        removeGlobalLayoutListener(getViewTreeObserver(), this);
    }
}