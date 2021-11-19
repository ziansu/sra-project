@org.junit.Test
public void getProgressTest() {
    int param;
    param = 0;
    task.setProgress(param);
    assertEquals(param, task.getProgress());
}