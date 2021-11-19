private void initialize() {
    new java.lang.Thread(this.voice).start();
    this.prevSelectedLights = new java.util.ArrayList<java.lang.Integer>();
    this.selectedLights = new java.util.ArrayList<java.lang.Integer>();
    light = new constellation.LightUnit();
}