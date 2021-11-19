@java.lang.Override
protected void onStart() {
    super.onStart();
    de.greenrobot.event.EventBus.getDefault().register(this);
    super.onStart();
}