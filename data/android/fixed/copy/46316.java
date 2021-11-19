public void assignSim(java.lang.String id, int state, java.lang.String link) {
    if ((type) == (com.android.internal.telephony.HardwareConfig.DEV_HARDWARE_TYPE_SIM)) {
        uuid = id;
        modemUuid = link;
        this.state = state;
    }
}