private void setupCriterionsController() throws java.lang.Exception {
    criterionsController = new org.libreplan.web.resources.worker.CriterionsController(workerModel);
    criterionsController.doAfterCompose(getCurrentWindow().getFellow("criterionsContainer"));
}