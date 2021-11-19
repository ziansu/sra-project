@org.sakaiproject.entitybroker.entityprovider.annotations.EntityURLRedirect(value = "/{prefix}/profile-view/{userUuid}")
public java.lang.String redirectToUserProfile(final java.util.Map<java.lang.String, java.lang.String> vars) {
    return this.linkLogic.getInternalDirectUrlToUserProfile(vars.get("userUuid"));
}