public boolean add(org.cruxframework.crux.core.client.screen.views.View view, boolean lazy, boolean closeable) {
    if (doAdd(view, lazy, closeable)) {
        adoptView(view);
        return true;
    }
    return false;
}