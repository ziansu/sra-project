@java.lang.Override
public void onStop() {
    super.onStop();
    mRealm.close();
    org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
}