public void removeReservation(int resID) {
    this.resIDs.remove(resID);
    Framework.deleteReservation(resID);
}