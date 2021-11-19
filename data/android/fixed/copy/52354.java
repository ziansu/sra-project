@org.greenrobot.eventbus.Subscribe
public void onEvent(org.openbmap.events.onServiceShutdown event) {
    this.finish();
}