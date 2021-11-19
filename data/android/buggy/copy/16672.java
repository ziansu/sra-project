public void addPassenger(core.Passenger pass) {
    if ((!(contains(pass))) && (hasRoom())) {
        passengerList.add(pass);
    }
}