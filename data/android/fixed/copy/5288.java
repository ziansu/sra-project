private void startProxy() {
    de.greenrobot.event.EventBus.getDefault().register(this);
    if ((proxy) == null) {
        proxy = com.shonshampain.streamrecorder.util.StreamProxy.getInstance();
    }
    proxy.start();
}