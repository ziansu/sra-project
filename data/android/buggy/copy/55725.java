public pl.mwezyk.parking.model.SingleCarStop checkCarStop(java.lang.String carPlateNumber) {
    pl.mwezyk.parking.model.SingleCarStop singleCarStop = carStopDAO.getSingleCarStop(carPlateNumber);
    java.lang.System.out.println(singleCarStop);
    return singleCarStop;
}