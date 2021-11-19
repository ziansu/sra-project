void bringToFront(net.mready.hover.HoverWindow window) {
    checkWindow(window);
    if (!(window.attached)) {
        return ;
    }
    windowManager.removeView(window.windowView);
    windowManager.addView(window.windowView, window.windowLayoutParams);
}