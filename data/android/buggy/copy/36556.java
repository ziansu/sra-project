@ulm.university.news.api.DELETE
@ulm.university.news.api.Path(value = "/{channelId}/user/{userId}")
public javax.ws.rs.core.Response unsubscribeChannel(@ulm.university.news.api.HeaderParam(value = "Authorization")
java.lang.String accessToken, @ulm.university.news.api.PathParam(value = "channelId")
int channelId, @ulm.university.news.api.PathParam(value = "userId")
int userId) throws ulm.university.news.util.exceptions.ServerException {
    channelCtrl.unsubscribeChannel(accessToken, channelId, userId);
    return javax.ws.rs.core.Response.status(Response.Status.NO_CONTENT).build();
}