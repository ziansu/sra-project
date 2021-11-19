@java.lang.Override
public void run() {
    boolean discoveryRes = activeGatt.discoverServices();
    if (!discoveryRes) {
        discoverServicesError = ARSAL_ERROR_ENUM.ARSAL_ERROR;
        discoverServicesSem.release();
    }
}