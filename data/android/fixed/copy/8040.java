private void handleUpRequest(se.dexica.FloorRequest newRequest) {
    java.lang.System.out.println("Handling up request");
    if (onWayToDestination(newRequest)) {
        upPath.add(destination);
        destination = newRequest;
    }else {
        upPath.add(newRequest);
    }
    sortUpPath();
}