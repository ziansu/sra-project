public boolean isRealWorker() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info("WorkerCRUDController.isRealWorker");
    return !(isVirtualWorker());
}