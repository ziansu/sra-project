public void connecter() {
    boolean success = validateCredentials();
    client.setMotDePasse(null);
    setLoggedIn(success);
}