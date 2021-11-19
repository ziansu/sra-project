public static play.mvc.Result displayMessage(controllers.Strinf message) {
    return ok(views.html.displayMessage.render(message));
}