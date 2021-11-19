@java.lang.Override
protected java.lang.String readList(org.openhome.net.device.IDvInvocation paramIDvInvocation, java.lang.String arg1) {
    log.debug((("ReadList: " + arg1) + (org.rpi.utils.Utils.getLogText(paramIDvInvocation))));
    return getList(arg1);
}