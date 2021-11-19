@ulm.university.news.api.DELETE
@ulm.university.news.api.Path(value = "/{id}/user")
public javax.ws.rs.core.Response unsubscribeChannel(@ulm.university.news.api.HeaderParam(value = "Authorization")
java.lang.String accessToken, @ulm.university.news.api.PathParam(value = "id")
int channelId) throws ulm.university.news.util.exceptions.ServerException {
    channelCtrl.unsubscribeChannel(accessToken, channelId);
    return javax.ws.rs.core.Response.status(Response.Status.NO_CONTENT).build();
}