@java.lang.Override
protected void setup() {
    org.apache.log4j.PropertyConfigurator.configure("log4j.properties");
    state = 0;
    currentLocation = map.getCurrentLocation();
    loginAtAntWorld();
    loginAtToppic();
    logic(null);
    addBehaviours();
    registerOnMap();
}