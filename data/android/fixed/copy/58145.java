private java.lang.String getDESystemId() {
    if ((userInfo.hasAppsInfoError()) || ((userInfo.getSystemIds()) == null)) {
        return DE_SYSTEM_ID;
    }else {
        return userInfo.getSystemIds().getDESytemId();
    }
}