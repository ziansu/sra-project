public static user.GoogleUser getCurrentUser() {
    com.google.appengine.api.users.UserService userService = com.google.appengine.api.users.UserServiceFactory.getUserService();
    return new user.GoogleUser(userService.getCurrentUser());
}