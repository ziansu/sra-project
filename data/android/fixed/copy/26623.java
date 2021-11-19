@java.lang.Override
public void onGlobalLayout() {
    com.studio.artaban.leclassico.helpers.Logs.add(Logs.Type.V, null);
    monthYear.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    mMonthWidth = monthYear.getWidth();
}