public void onProvisionCompleted() {
    if (((state) != (STATE_OPENING)) && (!(isOpen()))) {
        return ;
    }
    if (openInternal(false)) {
        doLicense();
    }
}