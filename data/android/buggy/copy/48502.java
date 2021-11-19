@java.lang.Override
public void run() {
    if ((isUserLocationEnabled()) == false) {
        toggleUserLocation();
    }
}