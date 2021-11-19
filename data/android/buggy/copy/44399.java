@org.junit.Test(timeout = 10000)
public void testContainsKey() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap map = map5(((net.openhft.chronicle.engine.map.StatelessChronicleMapTest.s_port)++))) {
        assertTrue(map.containsKey(one));
        assertFalse(map.containsKey(zero));
    }
}