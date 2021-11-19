void updateWindow(net.mready.hover.HoverWindow window) {
    checkWindow(window);
    if (!(window.attached)) {
        return ;
    }
    windowManager.updateViewLayout(window.windowView, window.windowLayoutParams);
}