public void unload() {
    if ((this.isStopped()) && (this.isFull())) {
        java.lang.System.out.println("Unboarding...");
        this.allowUnboarding = true;
    }
}