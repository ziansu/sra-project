private org.libreplan.web.common.OnlyOneVisible getVisibility() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.getVisibility" + (getWorker())));
    if ((visibility) == null) {
        visibility = new org.libreplan.web.common.OnlyOneVisible(listWindow, editWindow);
    }
    return visibility;
}