@java.lang.Override
public void onResume() {
    super.onResume();
    setFilters();
    startService(io.hnnt.sp3remote.UsbService.class, usbConnection, null);
    org.greenrobot.eventbus.EventBus.getDefault().register(commandHandler);
}