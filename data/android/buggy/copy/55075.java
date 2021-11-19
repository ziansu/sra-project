@java.lang.Override
public void run() {
    status.refreshStatusItems(call, isVideoEnabled(call));
    if (call.getCurrentParamsCopy().getVideoEnabled()) {
        showVideoView();
    }
}