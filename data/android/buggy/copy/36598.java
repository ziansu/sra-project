public void addLight(rpEngine.graphical.objects.Light light) {
    if ((lights) == null)
        lights = new java.util.ArrayList<>();
    
    this.lights.add(light);
}