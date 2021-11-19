@org.junit.Test
public void testFailTaskValue2IsCorrect() {
    org.framework.core.runtime.FailTask task = new org.framework.core.runtime.FailTask("test", 1, 2);
    org.junit.Assert.assertEquals(task.getValue2(), 2);
    org.junit.Assert.assertNotEquals(task.getValue2(), 7);
}