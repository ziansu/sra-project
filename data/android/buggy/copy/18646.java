@java.lang.Override
protected boolean check() throws java.lang.Exception {
    return (processAPI.getPendingHumanTaskInstances(this.getSession().getUserId(), 0, 10, null).size()) >= 1;
}