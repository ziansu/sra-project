@com.google.appinventor.components.annotations.SimpleFunction(description = "Read Tx power from a connected BLE device with Tx Power Service.")
public int FoundDeviceRssi(int index) {
    if (index <= (mLeDevices.size()))
        return mLeDeviceRssi.get(mLeDevices.get((index - 1)));
    else
        return -1;
    
}