private java.lang.String getDESystemId() {
    if (userInfo.hasAppsInfoError()) {
        return DE_SYSTEM_ID;
    }else {
        return userInfo.getSystemIds().getDESytemId();
    }
}