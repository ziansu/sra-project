public at.sheldor5.tr.api.user.User getUser(java.util.UUID uuid) {
    at.sheldor5.tr.api.user.User user = dataAccessLayer.getUser(uuid);
    return user == null ? new at.sheldor5.tr.api.user.User() : user;
}