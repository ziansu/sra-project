void removeDevice(int index) {
    devices.remove(index);
    update();
    deviceIdx = -1;
}