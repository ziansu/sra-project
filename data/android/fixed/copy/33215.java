@javax.ws.rs.PUT
public javax.ws.rs.core.Response updateUser(org.obiba.agate.web.model.Agate.UserDto userDto) {
    userService.getUser(id);
    return super.updateUser(userDto);
}