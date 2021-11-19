public void showAllWorkers() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.showAllWorkers" + (getWorker())));
    listing.setModel(new org.zkoss.zul.SimpleListModel(workerModel.getAllCurrentWorkers().toArray()));
    listing.invalidate();
}