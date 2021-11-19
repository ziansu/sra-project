public void detectPattern(java.lang.String[] args, java.util.List<gui.DesignPatternInstance> instances) {
    thisInstance = new gui.DesignPatternInstance("Composite");
    findSeedComposites();
    decorateComponents();
    getClassesInPattern();
    identifyPatternClasses();
    instances.add(thisInstance);
}