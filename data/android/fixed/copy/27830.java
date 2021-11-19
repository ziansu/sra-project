private void refreshView() {
    if ((getMapService().getMapWidget()) != null) {
        getMapService().getMapWidget().triggerResize();
    }
}