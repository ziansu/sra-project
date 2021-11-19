public static play.mvc.Result registration() {
    controllers.Application.usernameSes = session("username");
    if ((controllers.Application.usernameSes) == null) {
        controllers.Application.usernameSes = "";
    }
    return ok(registration.render(controllers.Application.usernameSes, "", ""));
}