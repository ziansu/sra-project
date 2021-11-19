public synchronized boolean addPassenger(core.Passenger pass) {
    if ((!(contains(pass))) && (hasRoom())) {
        passengerList.add(pass);
        return true;
    }
    return false;
}