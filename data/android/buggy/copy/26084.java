public void remNick(java.lang.String nick) {
    io.github.likcoras.agar.auth.AuthLevel level = nicks.remove(nick);
    if (level != null) {
        writeNicks();
    }
}