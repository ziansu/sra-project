private boolean checkPlayerName(final java.lang.String name) {
    return !(((name.contains(".")) | (name.contains("/"))) | (name.contains("\\")));
}