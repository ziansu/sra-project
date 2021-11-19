@java.lang.Override
public void makeReservation(cs544.edu.entities.Reservation reservation, java.lang.Long customerId) {
    cs544.edu.entities.Customer customer = new cs544.edu.entities.Customer();
    customer.setId(customerId);
    reservation.setCustomer(customer);
    reservation.setStatus(ReservationStatus.NEW);
    reservationRepository.save(reservation);
}