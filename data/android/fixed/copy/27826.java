public com.ma.schiffeversenken.android.model.Field.ShipDescriptor newShipDescriptor(com.ma.schiffeversenken.android.model.Ship ship) {
    com.ma.schiffeversenken.android.model.Field.ShipDescriptor shipDesc = new com.ma.schiffeversenken.android.model.Field.ShipDescriptor();
    shipDesc.location = new com.ma.schiffeversenken.android.model.Field.LocationDescriptor().newLocationDescriptor(ship.location);
    return shipDesc;
}