public pl.mwezyk.parking.model.SingleCarStop stopParkingTimer(java.lang.String carPlateNumber, long id) {
    pl.mwezyk.parking.model.SingleCarStop singleCarStop = getSingleCarStop(carPlateNumber, id);
    singleCarStop.setEndDate(java.util.Calendar.getInstance().getTime());
    entityManager.merge(singleCarStop);
    return singleCarStop;
}