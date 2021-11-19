public void resetSimulation(java.util.Hashtable<java.lang.String, java.lang.Integer> settings) {
    controller.init();
    if (settings != null)
        controller.loadParameters(settings);
    
    this.updateInfo();
}