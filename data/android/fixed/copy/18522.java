public void execute(org.gradle.internal.remote.ObjectConnection connection) {
    org.gradle.process.internal.worker.DefaultWorkerLoggingProtocol defaultWorkerLoggingProtocol = new org.gradle.process.internal.worker.DefaultWorkerLoggingProtocol(outputEventListener);
    connection.useParameterSerializers(org.gradle.process.internal.worker.WorkerLoggingSerializer.create());
    connection.addIncoming(org.gradle.process.internal.worker.child.WorkerLoggingProtocol.class, defaultWorkerLoggingProtocol, null);
    workerProcess.onConnect(connection);
}