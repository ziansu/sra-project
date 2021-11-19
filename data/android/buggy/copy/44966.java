private void resp2Ctrl(java.util.UUID id, boolean resp) {
    getPortByName("respToCtrl", org.kevoree.framework.MessagePort.class).process(new esir.dom11.nsoc.service.RequestResult(id, resp));
}