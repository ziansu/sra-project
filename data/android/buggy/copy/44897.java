private void deleteMovingPoints() {
    for (int i = (this.movingPoints.size()) - 1; i <= 0; i--) {
        this.root.delete(this.movingPoints.get(i));
    }
}