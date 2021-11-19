public java.util.List<java.lang.String> getWhitelistedPlayersList() {
    java.util.List<java.lang.String> list = new java.util.concurrent.CopyOnWriteArrayList<java.lang.String>();
    list.addAll(whitelistPlayers);
    return list;
}