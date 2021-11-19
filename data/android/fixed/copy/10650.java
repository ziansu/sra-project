@play.db.jpa.Transactional(readOnly = true)
public java.util.ArrayList<models.UserLabRole> getRoleAccess(java.lang.String email) {
    models.User user = new models.User();
    java.util.ArrayList<models.UserLabRole> userLabRole = core.UserCore.getUserLabRole(jpaApi, email);
    return userLabRole;
}