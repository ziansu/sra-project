public void simplify() {
    if (this.root.simplify()) {
        this.fitness = java.lang.Double.MAX_VALUE;
    }
}