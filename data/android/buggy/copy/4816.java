@org.springframework.web.bind.annotation.RequestMapping(value = MAPPING_SIGNUP, method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public com.epam.socode.response.Response handleSignup(@org.springframework.web.bind.annotation.RequestBody
com.epam.socode.request.Signup signup) {
    profileService.addProfile(new com.epam.socode.domain.Profile(signup));
    return com.epam.socode.response.Response.newSuccessResponse(signup);
}