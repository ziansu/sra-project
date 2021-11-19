protected synchronized void reload() {
    if (isOutOfDate())
        return ;
    
    try {
        doReload();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        lastReloadTime = new java.util.Date();
    }
}