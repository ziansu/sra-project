public void cleanup() {
    this.rootNode.detachChild(startGeometry);
    App.rally.getPhysicsSpace().add(startGeometry);
}