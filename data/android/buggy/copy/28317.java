@gov.samhsa.c2s.staffuiapi.infrastructure.RequestMapping(value = "/users/{userId}/activation", method = RequestMethod.POST)
java.lang.Object initiateUserActivation(@gov.samhsa.c2s.staffuiapi.infrastructure.PathVariable(value = "userId")
java.lang.Long userId, @gov.samhsa.c2s.staffuiapi.infrastructure.RequestParam(value = "lastUpdatedBy")
java.lang.String lastUpdatedBy, @gov.samhsa.c2s.staffuiapi.infrastructure.RequestHeader(value = gov.samhsa.c2s.staffuiapi.infrastructure.UmsClient.X_FORWARDED_PROTO)
java.lang.String xForwardedProto, @gov.samhsa.c2s.staffuiapi.infrastructure.RequestHeader(value = gov.samhsa.c2s.staffuiapi.infrastructure.UmsClient.X_FORWARDED_HOST)
java.lang.String xForwardedHost, @gov.samhsa.c2s.staffuiapi.infrastructure.RequestHeader(value = gov.samhsa.c2s.staffuiapi.infrastructure.UmsClient.X_FORWARDED_PORT)
int xForwardedPort);