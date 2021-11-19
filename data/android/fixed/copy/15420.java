@org.junit.Test(timeout = 5000)
public void testPutIfAbsent2() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap map = map5()) {
        assertEquals("A", map.putIfAbsent(one, "Z"));
    }
}