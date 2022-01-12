@java.lang.Override
protected void onResume() {
    super.onResume();
    org.greenrobot.eventbus.EventBus.getDefault().post(new com.createchance.doorgod.util.AppListForegroundEvent(true));
}