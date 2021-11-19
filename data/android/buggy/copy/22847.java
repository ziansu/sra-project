@java.lang.Override
public void onStop() {
    super.onStop();
    org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    android.util.Log.i("onStop", ": CONTAINER");
}