private void releaseAllDevelopers() {
    for (nl.saxion.maurens.company.Developer developer : this.developer) {
        developer.release();
    }
    this.developer.clear();
}