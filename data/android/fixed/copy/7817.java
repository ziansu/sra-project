void runDiagnostics() {
    if ((this.errors) == null) {
        this.errors = new java.util.ArrayList<>();
    }
    validateContentPath();
    generateStatus();
}