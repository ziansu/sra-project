public void hide() {
    if ((notificationManager) == null)
        return ;
    
    notificationManager.cancel(nfyId);
    notify = null;
    notificationManager = null;
}