@org.junit.Test(timeout = 5000)
public void testPutIfAbsent() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap map = map5()) {
        map.putIfAbsent(six, "Z");
        assertTrue(map.containsKey(six));
    }
}