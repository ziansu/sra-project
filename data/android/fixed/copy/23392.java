public java.lang.String logout(spark.Request request, spark.Response response) throws fr.litarvan.slark.light.server.APIError {
    fr.litarvan.slark.light.server.http.controller.AuthController.requireLogged(request);
    fr.litarvan.slark.light.server.http.controller.AuthController.tokens.remove(request.ip());
    return success(response);
}