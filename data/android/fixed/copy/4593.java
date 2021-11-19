private java.lang.String getMailFromUserOrGeneratedURLParam(java.lang.String generated) {
    java.lang.String mail = getMailFromLoggedInUser();
    if ("anonymousUser".equals(mail)) {
        return null;
    }
    return mail;
}