public android.location.Location getLastLocation() {
    return (lastLocation) == null ? null : new android.location.Location(lastLocation);
}