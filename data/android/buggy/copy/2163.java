public void update() {
    for (java.lang.System system : this.systems) {
        system.update();
        flush();
    }
}