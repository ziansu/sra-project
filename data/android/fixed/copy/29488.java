@controllers.BodyParser.Of(value = BodyParser.Json.class)
public static controllers.Result ajaxCall(java.lang.String id) {
    response().setContentType("text/javascript");
    controllers.ObjectNode response = controllers.Application.ajax.handle(request().body().asJson(), id);
    return ok(response);
}