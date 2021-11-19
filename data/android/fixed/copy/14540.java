public static controllers.Result logOut() {
    session().clear();
    return redirect(routes.Application.index());
}