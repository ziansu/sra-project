public java.lang.String validate() {
    controllers.UserManagement.log.debug(("Token in the form: " + (token)));
    return controllers.UserManagement.passwordValidate(password, retypePassword);
}