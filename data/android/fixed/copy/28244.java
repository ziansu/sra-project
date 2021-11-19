@org.springframework.security.access.annotation.Secured(value = "ROLE_ADMIN")
@com.dreamteam.datavisualizator.controllers.RequestMapping(path = "/update-user", method = RequestMethod.GET)
public com.dreamteam.datavisualizator.models.User updateUser(@com.dreamteam.datavisualizator.controllers.RequestParam(value = "firstName")
java.lang.String firstName, @com.dreamteam.datavisualizator.controllers.RequestParam(value = "lastName")
java.lang.String lastName, @com.dreamteam.datavisualizator.controllers.RequestParam(value = "email")
java.lang.String email) {
    return null;
}