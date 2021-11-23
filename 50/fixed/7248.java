public boolean isOnline(java.lang.String username) {
    username = username.toLowerCase();
    if (com.example.project.SessionManager.SessionManager.clients.containsKey(username))
        return true;
    
    return false;
}