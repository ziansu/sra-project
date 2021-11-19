public java.lang.String getEffName() {
    try {
        return getSession().getEffectiveUserName();
    } catch (java.lang.Exception e) {
        com.paulwithers.openLog.OpenLogUtil.debugPrint(e);
        return "";
    }
}