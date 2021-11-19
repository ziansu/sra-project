private void leaveLobby() {
    setAnalyser(new connection.MenuAnalyser(server, this, id, true));
    queue.clear();
}