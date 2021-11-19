public void show(boolean show) {
    if (show && (mFrame.isShown()))
        return ;
    
    close(false);
    com.mapswithme.util.UiUtils.showIf(show, mFrame);
}