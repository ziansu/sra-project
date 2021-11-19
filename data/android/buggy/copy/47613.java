public boolean seekBackward() {
    java.util.ArrayList<java.lang.String> args = new java.util.ArrayList<java.lang.String>();
    args.add(("" + true));
    server.notifyClients(MessageType.SEEKNOTIFY, args);
    return player.seekBackward();
}