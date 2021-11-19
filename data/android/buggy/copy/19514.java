public com.dexecutor.executor.graph.Graph.Node<T> call() throws java.lang.Exception {
    com.dexecutor.executor.TaskProvider.Task task = taskProvider.provid(node.getValue());
    task.execute();
    return node;
}