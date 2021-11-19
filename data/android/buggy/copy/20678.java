@org.springframework.web.bind.annotation.ExceptionHandler(value = org.springframework.security.core.userdetails.UsernameNotFoundException.class)
@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.FORBIDDEN)
public java.lang.String handleUsernameException(java.lang.Exception e) {
    org.patientview.api.controller.BaseController.LOG.error(("Login failed: " + (e.getMessage())));
    return e.getMessage();
}