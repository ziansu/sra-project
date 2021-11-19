public void handleInitResult(boolean val) {
    if ((session) == null)
        return ;
    
    setInitSuccess(val);
    session.onSecurityInitialized();
}