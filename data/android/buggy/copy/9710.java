private java.lang.String unsubcribeLink() {
    try {
        return (((baseUrl()) + "/user/") + (userName)) + "?edit=true#general";
    } catch (com.sixsq.slipstream.exceptions.ValidationException ve) {
        com.sixsq.slipstream.action.usage.MailUsage.logger.warning("Unable to get base URL");
        return null;
    }
}