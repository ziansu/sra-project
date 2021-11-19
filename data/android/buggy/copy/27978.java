@java.lang.Override
public void refuseReservationProcessing(main.java.com.hotelSystem.model.Reservation reservation) {
    try {
        update(reservation, ReservationStatus.REFUSED_FROM_PROCESSING, null, false);
    } catch (main.java.com.hotelSystem.exception.DaoException e) {
        throw new main.java.com.hotelSystem.exception.SystemException(main.java.com.hotelSystem.app.constants.MessageCode.REFUSE_RESERVATION_PROCESSING_SYSTEM_EXCEPTION, e, reservation.getId());
    }
}