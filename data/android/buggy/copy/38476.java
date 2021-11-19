public void addBooking(Model.Booking b) {
    b.setId(DataBase.BookingDB.id);
    db.add(b);
    (DataBase.BookingDB.id)++;
}