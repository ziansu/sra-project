public void ControllerConnectionAbort() {
    if ((initOk) == true) {
        nativeControllerConnectionAbort(nativeARDiscoveryConnection);
    }
}