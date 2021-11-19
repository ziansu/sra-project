public void setBoundUser(org.libreplan.business.users.entities.User user) {
    workerModel.setBoundUser(user);
    org.libreplan.web.common.Util.reloadBindings(userBindingGroupbox.getFellow("existingUserPanel"));
}