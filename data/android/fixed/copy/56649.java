@java.lang.Override
public void onAttachedToWindow() {
    super.onAttachedToWindow();
    accelerated.set(isHardwareAccelerated());
    listenerCalled.notifyCalled();
    dialog.dismiss();
}