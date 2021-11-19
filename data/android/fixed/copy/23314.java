public es.upm.miw.builder.HotelBuilder reservation(es.upm.miw.ecp1.Reservation reservation) {
    assert reservation != null;
    hotel.addReservation(reservation);
    return this;
}