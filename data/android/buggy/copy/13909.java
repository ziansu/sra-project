public play.mvc.Result index() {
    boolean error = false;
    femr.business.dtos.CurrentUser currentUserSession = sessionService.getCurrentUserSession();
    return ok(index.render(currentUserSession, error));
}