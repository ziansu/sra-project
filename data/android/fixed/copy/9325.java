public java.lang.String getEmail() {
    org.libreplan.business.users.entities.User user = getBoundUser();
    if (user != null) {
        return user.getEmail();
    }
    return "";
}