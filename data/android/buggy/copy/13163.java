@java.lang.Override
protected void onStart() {
    de.greenrobot.event.EventBus.getDefault().register(this);
    super.onStart();
}