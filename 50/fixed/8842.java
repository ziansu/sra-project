public org.libreplan.web.resources.worker.LocalizationsController getLocalizations() {
    if (workerModel.isCreating()) {
        return localizationsForCreationController;
    }
    return localizationsForEditionController;
}