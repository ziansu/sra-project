public final void initWorker(final org.jacpfx.rcp.worker.AEmbeddedComponentWorker worker) {
    workerRef = worker;
    workerRef.start();
}