public void handle(org.dsa.iot.dslink.node.actions.ActionResult event) {
    master = getMaster();
    checkConnection();
    node.removeChild("start");
    makeStopAction();
}