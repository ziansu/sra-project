public boolean updateBooking(model.Booking booking) {
    if ((this.validate(booking)) && (bookingDAO.updateBooking(booking))) {
        return true;
    }
    return false;
}