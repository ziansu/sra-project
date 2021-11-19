@org.springframework.web.bind.annotation.RequestMapping(value = "/navigation", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Integer login(@org.springframework.web.bind.annotation.RequestParam(value = "token")
java.lang.Integer token) {
    if (smartcity.accessibility.services.LogInService.isUserLoggedIn(token)) {
        throw new smartcity.accessibility.services.exceptions.UserDoesNotExistException();
    }
    return 0;
}