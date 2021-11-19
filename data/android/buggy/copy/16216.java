private void setLongitude(double longitude) throws exceptions.InvalidCoordinatesException {
    if ((longitude < 0) || (longitude > 180)) {
        throw new exceptions.InvalidCoordinatesException();
    }
    this.longitude = longitude;
}