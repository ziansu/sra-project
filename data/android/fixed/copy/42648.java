public static void addMember(java.lang.String username, java.net.Socket clientSocket) {
    username = username.toLowerCase();
    com.example.project.SessionManager.SessionManager.clients.put(username, clientSocket);
}