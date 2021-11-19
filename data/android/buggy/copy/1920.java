public boolean isEditing() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.isEditing" + (getWorker())));
    return ((getWorker()) != null) && (!(getWorker().isNewObject()));
}