public void update() {
    flush();
    for (java.lang.System system : this.systems) {
        system.update();
        flush();
    }
}