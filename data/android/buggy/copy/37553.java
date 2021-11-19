@parking.controllers.RequestMapping(value = "/users/{username}", method = RequestMethod.DELETE)
public java.lang.Long deleteUser(@parking.controllers.PathVariable(value = "username")
java.lang.String username, javax.servlet.http.HttpServletRequest request) throws parking.exceptions.ApplicationException {
    return adminService.deleteUser(username, request);
}