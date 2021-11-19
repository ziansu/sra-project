public void cancelCurrentSession() {
    if ((currentSession) != null) {
        api.logout(currentSession);
        notifyDataChanged();
    }
    currentSession = null;
}