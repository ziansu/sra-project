@java.lang.Override
public void setCurrentViewport(lecho.lib.hellocharts.model.Viewport targetViewport) {
    if (null != targetViewport) {
        isLoading = false;
        chartRenderer.setCurrentViewport(targetViewport);
        chartComputator.setCurrentViewport(targetViewport);
        setAxesY();
    }
    android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
}