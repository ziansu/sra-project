public void executeTasks() {
    pj.pr.task.TargetTask<?> task = null;
    while ((task = this.getTask()) != null) {
        try {
            task.run();
        } finally {
            task = null;
        }
    } 
}