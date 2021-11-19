private boolean isAccessible(org.araqne.logdb.query.command.StorageObjectName name) {
    return accountService.checkPermission(query.getContext().getSession(), name.getTable(), Permission.READ);
}