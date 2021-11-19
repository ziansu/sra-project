private void reloadCurrentWindow() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.reloadCurrentWindow" + (getWorker())));
    org.libreplan.web.common.Util.reloadBindings(getCurrentWindow());
}