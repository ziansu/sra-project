public void setDevState(com.alperez.bt_microphone.core.DeviceState devState) {
    if ((this.devState) != devState) {
        this.devState = devState;
        notifyPropertyChanged(BR.devState);
    }
}