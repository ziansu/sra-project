@java.lang.Override
public int getItemCount() {
    synchronized(mDeviceList) {
        return (mDeviceList) == null ? 0 : mDeviceList.size();
    }
}