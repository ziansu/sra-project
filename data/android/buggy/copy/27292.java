public void updateAcceptanceMap(java.util.HashMap<java.lang.String, java.lang.String> hashedUpdate) throws java.io.IOException {
    this.acceptanceMap = hashedUpdate;
    write();
}