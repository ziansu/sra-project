private java.lang.String getMailFromUserOrGeneratedURLParam(java.lang.String generated) {
    java.lang.String mail = getMailFromLoggedInUser();
    if (mail.equals("anonymousUser")) {
        return null;
    }
    return mail;
}