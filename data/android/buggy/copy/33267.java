public static void main(java.lang.String[] args) {
    edu.ualbany.icis518.team6.Trips trip = edu.ualbany.icis518.team6.Trips.getbyTripId(3);
    java.lang.System.out.println(trip.getAllEmployeeOfThisTrip().get(0));
}