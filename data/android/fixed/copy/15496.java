@org.junit.Test
public void getTask() throws java.lang.Exception {
    jfdi.logic.events.AddTaskDoneEvent event = new jfdi.logic.events.AddTaskDoneEvent(task);
    assertSame(task, event.getTask());
}