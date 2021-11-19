@gov.samhsa.c2s.staffuiapi.web.PostMapping(value = "/{userId}/activation")
@gov.samhsa.c2s.staffuiapi.web.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
public java.lang.Object initiateUserActivation(@gov.samhsa.c2s.staffuiapi.web.PathVariable
java.lang.Long userId, @gov.samhsa.c2s.staffuiapi.web.RequestHeader(value = X_FORWARDED_PROTO)
java.lang.String xForwardedProto, @gov.samhsa.c2s.staffuiapi.web.RequestHeader(value = X_FORWARDED_HOST)
java.lang.String xForwardedHost, @gov.samhsa.c2s.staffuiapi.web.RequestHeader(value = X_FORWARDED_PORT)
int xForwardedPort) {
    return umsService.initiateUserActivation(userId, xForwardedProto, xForwardedHost, xForwardedPort);
}