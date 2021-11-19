@org.spine3.server.aggregate.Apply
private void event(org.spine3.examples.todolist.TaskCreated event) {
    getBuilder().setId(event.getId()).setCreated(com.google.protobuf.Timestamp.newBuilder().setSeconds(java.lang.System.currentTimeMillis())).setPriority(TaskPriority.NORMAL);
}