public static controllers.Result login() {
    session().clear();
    return ok(login.render());
}