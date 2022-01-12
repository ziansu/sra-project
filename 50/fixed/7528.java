@org.junit.Test
public void test_backlogRef() {
    softwaremanagementtool.agile.SprintTask task = new softwaremanagementtool.agile.SprintTask();
    assertEquals(task.getBacklogRef(), 9);
    assertEquals(task.BacklogRefProperty().get(), 9);
}