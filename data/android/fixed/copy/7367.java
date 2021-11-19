@org.junit.Test
public void getUpdateSubTasksTest() {
    boolean param;
    param = true;
    task.setUpdateSubTasks(param);
    assertEquals(param, task.getUpdateSubTasks());
}