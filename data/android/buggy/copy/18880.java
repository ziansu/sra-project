@org.junit.Test(timeout = 5000)
public void testReplaceValue2_NullPointerException() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap c = net.openhft.chronicle.engine.map.StatelessChronicleMapTest.newShmIntString(((net.openhft.chronicle.engine.map.StatelessChronicleMapTest.s_port)++))) {
        c.replace(notPresent, null, "A");
        shouldThrow();
    } catch (java.lang.NullPointerException success) {
    }
}