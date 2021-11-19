public synchronized void add(float value) {
    this.value += value;
    this.updated = true;
    this.unused = value == 0.0F;
}