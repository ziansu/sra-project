public java.lang.String getUserEditionButtonTooltip() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.getUserEditionButtonTooltip" + (getWorker())));
    if (isNoRoleUserAccounts()) {
        return org.libreplan.web.I18nHelper._("You do not have permissions to go to edit user window");
    }
    return "";
}