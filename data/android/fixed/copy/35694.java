@org.springframework.web.bind.annotation.ExceptionHandler(value = { com.codeabovelab.dm.common.security.token.TokenException.class , org.springframework.security.authentication.BadCredentialsException.class })
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.UNAUTHORIZED)
@org.springframework.web.bind.annotation.ResponseBody
public com.codeabovelab.dm.cluman.ui.model.UiError badCredentialsException(java.lang.Exception e) {
    log.error("Can't process request", e);
    return com.codeabovelab.dm.cluman.ui.ErrorHandler.createResponse(e.getMessage(), e.getMessage(), HttpStatus.UNAUTHORIZED);
}