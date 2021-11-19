@org.junit.Test
public void testLogEntryGetFails() {
    entry = new org.framework.core.runtime.LogEntry("test");
    org.framework.core.test.FailTask task = new org.framework.core.test.FailTask("task");
    assertEquals(task.getFails(), 1);
    assertNotEquals(task.getFails(), 10);
}