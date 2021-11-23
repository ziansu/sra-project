public ninja.Result listUsers() {
    java.util.List<ai.subut.kurjun.model.identity.User> users = identityManagerService.getAllUsers();
    return ninja.Results.html().template("views/users.ftl").render("users", users);
}