@org.sakaiproject.entitybroker.entityprovider.annotations.EntityURLRedirect(value = "/{prefix}/messages")
public java.lang.String redirectToMyMessages() {
    return linkLogic.getInternalDirectUrlToUserMessages(null);
}