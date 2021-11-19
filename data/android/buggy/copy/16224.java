public synchronized void setConnection(android.content.Context context, android.hardware.usb.UsbAccessory usbAccessory) {
    disconnect();
    mUsbContext = context;
    mUsbAccessory = usbAccessory;
    if (mIsOpen)
        connect();
    
}