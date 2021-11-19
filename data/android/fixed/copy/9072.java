public void simplify() {
    if (this.root.simplify()) {
        this.fitness = -1;
    }
}