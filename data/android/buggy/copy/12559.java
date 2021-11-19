public void setHull(double change) {
    hull = change;
    if ((hull) <= 0) {
        this.destroy();
    }
}