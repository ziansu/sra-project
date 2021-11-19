@org.junit.Test
public void getEffortTest() {
    long param;
    param = 0L;
    task.setEffort(param);
    assertEquals(param, task.getEffort());
}