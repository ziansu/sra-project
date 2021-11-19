private void setupLight() {
    com.jme3.light.DirectionalLight light = new com.jme3.light.DirectionalLight();
    light.setDirection(new com.jme3.math.Vector3f((-0.5F), (-1.0F), (-0.5F)).normalize());
    rootNode.addLight(light);
}