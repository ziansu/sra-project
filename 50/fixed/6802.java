@javax.ws.rs.GET
@javax.ws.rs.Path(value = "count")
@javax.annotation.security.RolesAllowed(value = ee.hm.dop.model.enums.RoleString.ADMIN)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.lang.Long getRestrictedUsersCount() {
    return userService.getRestrictedUsersCount(getLoggedInUser());
}