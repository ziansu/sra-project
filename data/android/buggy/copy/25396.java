void updateSessionForFailover() {
    if ((!(isNoSession())) || (stateless)) {
        return ;
    }
    getSession().setIsISStored(true);
}