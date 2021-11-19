@org.junit.Test
public void testLogEntryGetFails() {
    entry = new org.framework.core.runtime.LogEntry("test");
    assertEquals(entry.getFails(), 1);
    assertNotEquals(entry.getFails(), 10);
}