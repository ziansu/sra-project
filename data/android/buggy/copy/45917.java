public static void main(java.lang.String[] args) {
    kamon.Kamon.start();
    org.filteredpush.akka.workflows.WorkflowStarter ws = new org.filteredpush.akka.workflows.WorkflowStarter();
    ws.execute(args);
    kamon.Kamon.shutdown();
}