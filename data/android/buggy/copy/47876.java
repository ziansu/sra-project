@org.junit.Test
public void valid() {
    org.cloudfoundry.bosh.tasks.GetTaskRequest.builder().taskId("test-task-id").build();
}