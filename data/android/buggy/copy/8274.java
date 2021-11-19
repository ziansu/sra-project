@java.lang.Override
protected void onStop() {
    super.onStop();
    if (org.greenrobot.eventbus.EventBus.getDefault().isRegistered(this)) {
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }
}