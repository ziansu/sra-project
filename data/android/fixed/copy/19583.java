@java.lang.Override
public void onResume() {
    setFilters();
    startService(io.hnnt.sp3remote.UsbService.class, usbConnection, null);
    org.greenrobot.eventbus.EventBus.getDefault().register(commandHandler);
    super.onResume();
}