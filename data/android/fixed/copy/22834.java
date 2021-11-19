public static void setViewerVisibility(boolean visible) {
    if ((com.atinternet.tracker.Debugger.bubbleImage) != null) {
        com.atinternet.tracker.Debugger.bubbleVisibility = (visible) ? android.view.View.VISIBLE : android.view.View.GONE;
        com.atinternet.tracker.Debugger.bubbleImage.get().setVisibility(com.atinternet.tracker.Debugger.bubbleVisibility);
    }
}