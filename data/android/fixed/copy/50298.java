@io.swagger.annotations.ApiOperation(value = "Get a security token based on user name and password")
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, value = pet.store.spring.web.security.controllers.interfaces.SecurityTokenControllerI.TOKEN_BY_PASSWORD_URL_PATH, produces = "application/json")
public java.lang.String get(@io.swagger.annotations.ApiParam(value = "User name", required = true)
@org.springframework.web.bind.annotation.PathVariable
java.lang.String username, @io.swagger.annotations.ApiParam(value = "User password", required = true)
@org.springframework.web.bind.annotation.PathVariable
java.lang.String password) throws java.lang.Exception {
    return m_tokenService.getToken(username, password);
}