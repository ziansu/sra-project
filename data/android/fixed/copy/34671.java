public void setSteps(int steps, boolean generateGradientMap) {
    this.steps = steps;
    if (generateGradientMap) {
        generateGradientMap();
    }
}