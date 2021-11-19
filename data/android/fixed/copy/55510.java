@play.mvc.Security.Authenticated(value = controllers.Application.Secured.class)
public play.mvc.Result index() {
    return ok(index.render());
}