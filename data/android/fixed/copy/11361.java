public java.lang.String spelersToString() {
    java.lang.String spelersToString = " ";
    for (Game.ServerPeer s : spelers) {
        spelersToString = (spelersToString + "\n") + (s.getName());
    }
    return spelersToString;
}