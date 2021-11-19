public org.libreplan.web.resources.worker.LocalizationsController getLocalizations() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.getLocalizations" + (getWorker())));
    if (workerModel.isCreating()) {
        return localizationsForCreationController;
    }
    return localizationsForEditionController;
}