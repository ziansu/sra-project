public static play.mvc.Result index() {
    return ok(views.html.index.render("hello"));
}