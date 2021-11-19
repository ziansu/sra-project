@org.junit.Test(timeout = 5000)
public void testPutIfAbsent2() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap map = map5(((net.openhft.chronicle.engine.map.StatelessChronicleMapTest.s_port)++))) {
        assertEquals("A", map.putIfAbsent(one, "Z"));
    }
}