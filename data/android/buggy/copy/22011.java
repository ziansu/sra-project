private com.seal_de.controller.Task processTask(java.lang.String userId, com.seal_de.controller.Paper paper) {
    com.seal_de.controller.Task task = new com.seal_de.controller.Task();
    task.setUserId(userId);
    task.setPaperId(paper);
    task.setStatus(10);
    return task;
}