public static void addMember(java.lang.String username, java.net.Socket clientSocket) {
    com.example.project.SessionManager.SessionManager.clients.put(username, clientSocket);
}