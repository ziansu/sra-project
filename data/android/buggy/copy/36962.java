public void writeAll(java.lang.String str) {
    android.util.Log.d("Server", "Attempting to write to all clients");
    for (com.semaphore_soft.apps.cypher.networking.Server.ClientHandler server : com.semaphore_soft.apps.cypher.networking.Server.clients) {
        android.util.Log.d("Server", "Writing to client");
        server.write(str);
    }
}