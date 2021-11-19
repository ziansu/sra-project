@java.lang.Override
public void dispose() {
    getViewSite().getPage().removePartListener(_partListener);
    _mapApp.stop();
    super.dispose();
}