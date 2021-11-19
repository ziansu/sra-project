public boolean addReservation(hotelmanager.Reserve temp) {
    boolean result = false;
    if (checkReservations(temp)) {
        (reservationCount)++;
        temp.setReserveID(reservationCount);
        reservations.add(temp);
        result = true;
    }
    return result;
}