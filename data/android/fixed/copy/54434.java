private void hideWindow(net.mready.hover.HoverWindow window) {
    if (!(window.attached)) {
        return ;
    }
    windowManager.removeView(window.windowView);
    window.attached = false;
    window.performStop();
}