@java.lang.Override
public void switchAdded(org.projectfloodlight.openflow.types.DatapathId switchId) {
    icn.core.OFUtils.insertHTTPDpiFlow(switchService.getSwitch(switchId));
}