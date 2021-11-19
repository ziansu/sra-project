public void disconnect() {
    java.lang.System.out.println("Déconnexion.");
    this.user.setIsConnected(false);
    this.run(this.port);
}