public java.lang.String getName() {
    return new com.google.gerrit.server.AccountInfo(getAccount()).getName(anonymousCowardName);
}