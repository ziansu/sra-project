@org.junit.Test(timeout = 10000)
public void testReplaceValue_NullPointerException() throws java.io.IOException {
    try (net.openhft.chronicle.map.ChronicleMap c = net.openhft.chronicle.engine.map.StatelessChronicleMapTest.newShmIntString()) {
        c.replace(null, "A", "whatever");
        shouldThrow();
    } catch (java.lang.NullPointerException success) {
    }
}