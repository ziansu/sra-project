public java.lang.String delect() {
    if ((checkone) != null) {
        for (java.lang.String s : checkone) {
            com.rpms.action.BuildAction.delectObject(s);
        }
    }
    return "delect";
}