@org.junit.Test(timeout = 5000)
public void testReplace() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap map = map5(((net.openhft.chronicle.engine.map.StatelessChronicleMapTest.s_port)++))) {
        assertNull(map.replace(six, "Z"));
        assertFalse(map.containsKey(six));
    }
}