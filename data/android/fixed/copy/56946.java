public static controllers.Result signIn(java.lang.String mail, java.lang.String password) {
    controllers.Application.userMail = mail;
    return controllers.Application.game();
}