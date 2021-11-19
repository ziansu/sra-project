public synchronized void setActive(boolean active) {
    this.active = active;
    notify();
}