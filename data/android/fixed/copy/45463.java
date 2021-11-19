public void handleStopButton(com.fravokados.mindim.inventory.ContainerEntityPortalController containerEntityPortalController) {
    switch (state) {
        case CONNECTING :
        case OUTGOING_PORTAL :
        case INCOMING_PORTAL :
            closePortal(true);
            break;
    }
}