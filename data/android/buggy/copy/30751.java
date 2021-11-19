private static com.silverpeas.session.SessionInfo getAnonymousSession() {
    com.stratelia.webactiv.beans.admin.UserDetail anonymousUser = com.stratelia.webactiv.beans.admin.UserDetail.getAnonymousUser();
    if ((com.stratelia.webactiv.beans.admin.UserDetail.getAnonymousUser()) != null) {
        return new com.silverpeas.session.SessionInfo(null, anonymousUser);
    }
    return com.silverpeas.session.SessionInfo.NoneSession;
}