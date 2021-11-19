public java.lang.String findWindowActivityId(final com.zst.xposed.halo.floatingwindow3.tasks.Window mWindow) {
    for (java.lang.String id : activitiesStack.keySet()) {
        if (isWindowRegistered(mWindow, id))
            return id;
        
    }
    return null;
}