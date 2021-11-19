public void addOldPassword(org.ovirt.engine.extension.aaa.jdbc.core.Schema.User.PasswordHistory passwordHistory, int passwordHistoryLimit) {
    oldPasswords.add(passwordHistory);
    if ((oldPasswords.size()) > passwordHistoryLimit) {
        oldPasswords.remove(oldPasswords.last());
    }
}