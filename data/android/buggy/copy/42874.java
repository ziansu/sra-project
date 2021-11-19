@org.openbaton.nfvo.api.RequestMapping(method = RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@org.openbaton.nfvo.api.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
public byte[] generateKey(@org.openbaton.nfvo.api.RequestHeader(value = "project-id")
java.lang.String projectId, @org.openbaton.nfvo.api.RequestBody
java.lang.String name) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.spec.InvalidKeySpecException {
    return keyManagement.generateKey(projectId, name);
}