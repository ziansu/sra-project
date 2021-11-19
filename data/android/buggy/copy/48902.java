public void setBoundUser(org.libreplan.business.users.entities.User user) {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.setBoundUser" + (getWorker())));
    workerModel.setBoundUser(user);
    org.libreplan.web.common.Util.reloadBindings(userBindingGroupbox.getFellow("existingUserPanel"));
}