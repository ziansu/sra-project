public org.croudtrip.api.trips.JoinTripRequest updateJoinRequestPassengerCancel(org.croudtrip.api.trips.JoinTripRequest joinRequest) {
    org.croudtrip.api.trips.JoinTripRequest updatedRequest = new org.croudtrip.api.trips.JoinTripRequest(joinRequest, org.croudtrip.api.trips.JoinTripStatus.PASSENGER_CANCELLED);
    joinTripRequestDAO.update(updatedRequest);
    gcmManager.sendPassengerCancelledTripMsg(joinRequest);
    tripsUtils.updateArrivalTimesForOffer(joinRequest.getOffer(), null);
    return joinRequest;
}