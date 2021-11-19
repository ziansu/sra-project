@org.junit.Test
public void testMessageFlowMod() {
    org.openflow.protocol.OFFlowMod flowMod = createFlowMod();
    java.lang.String output = net.floodlightcontroller.interceptor.MessageSerializer.serializeMessage(1, flowMod);
    java.lang.System.out.println(output);
}