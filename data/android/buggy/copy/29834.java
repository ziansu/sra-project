private boolean edgeOccupied(shared.locations.EdgeLocation location) {
    boolean occupied = false;
    foreach((Road ? road : roads));
    {
        if ((road.getLocation()) == location) {
            occupied = true;
            break;
        }
    }
    return occupied;
}