private void validateCostCategoryAssigmentTab() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.validateCostCategoryAssigmentTab" + (getWorker())));
    resourcesCostCategoryAssignmentController.validateConstraints();
}