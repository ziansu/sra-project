public void handle(org.dsa.iot.dslink.node.actions.ActionResult event) {
    if ((localDevice) != null)
        localDevice.terminate();
    
    init();
}