@org.junit.Test(timeout = 5000)
public void testReplace2() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap map = map5()) {
        assertNotNull(map.replace(one, "Z"));
        assertEquals("Z", map.get(one));
    }
}