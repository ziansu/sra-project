@org.spine3.server.aggregate.Apply
public void event(org.spine3.examples.todolist.TaskReopened event) {
    getBuilder().setId(event.getId());
}