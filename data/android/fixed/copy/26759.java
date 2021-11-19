public void setPassenger(int seat, com.example.noah.onthefly.models.Passenger passenger) {
    passenger = com.example.noah.onthefly.models.Passenger.deepCopy(passenger);
    flight.getPassengers().put(("seat" + (java.lang.String.valueOf(seat))), passenger);
}