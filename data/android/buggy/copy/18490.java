public boolean isNoRoleUserAccounts() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.isNoRoleUserAccounts" + (getWorker())));
    return !(org.libreplan.web.security.SecurityUtils.isSuperuserOrUserInRoles(UserRole.ROLE_USER_ACCOUNTS));
}