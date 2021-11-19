@rest.POST
@rest.Path(value = PATH_CHANGE_AVATAR)
public javax.ws.rs.core.Response changeAvatarLink(model.User user) {
    profileService.changeAvatarLink(user);
    model.ConfirmMessage msg = new model.ConfirmMessage(MSG_AVATAR_LINK_GEANDERT, Response.Status.CREATED.getStatusCode());
    return javax.ws.rs.core.Response.ok().entity(msg).build();
}