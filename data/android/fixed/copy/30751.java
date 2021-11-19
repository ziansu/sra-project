private static com.silverpeas.session.SessionInfo getAnonymousSession() {
    com.stratelia.webactiv.beans.admin.UserDetail anonymousUser = com.stratelia.webactiv.beans.admin.UserDetail.getAnonymousUser();
    if (anonymousUser != null) {
        return new com.silverpeas.session.SessionInfo(null, anonymousUser);
    }
    return com.silverpeas.session.SessionInfo.NoneSession;
}