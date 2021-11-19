public void remove() {
    vegetation.remove();
    parent.updateGeometricState();
    terrain.removeFromParent();
}