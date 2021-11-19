private void refreshMonitorComposite() {
    if (((monitorComposite) != null) && (!(monitorComposite.isDisposed()))) {
        monitorComposite.dispose();
    }
    initGraphicComponents(this);
    monitorComposite.layout();
}