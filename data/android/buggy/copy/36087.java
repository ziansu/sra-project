public void onApplyFilter() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.onApplyFilter" + (getWorker())));
    org.libreplan.web.resources.search.ResourcePredicate predicate = createPredicate();
    if (predicate != null) {
        filterByPredicate(predicate);
    }else {
        showAllWorkers();
    }
}