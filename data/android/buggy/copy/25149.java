public void removeDevice(int address) {
    final me.legrange.panstamp.PanStamp ps = devices.get(address);
    if (ps != null) {
        fireDeviceRemoved(ps);
        ps.destroy();
        devices.remove(address);
    }
}