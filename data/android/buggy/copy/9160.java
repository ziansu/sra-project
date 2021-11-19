public pl.mwezyk.parking.model.SingleCarStop stopParkingTimer(java.lang.String carPlateNumber) {
    pl.mwezyk.parking.model.SingleCarStop singleCarStop = getSingleCarStop(carPlateNumber);
    singleCarStop.setEndDate(java.util.Calendar.getInstance().getTime());
    entityManager.merge(singleCarStop);
    return singleCarStop;
}