@java.lang.Override
public void onVehicleChange(java.lang.String vehicleId) {
    mVehicleId = com.google.common.base.Preconditions.checkNotNull(vehicleId, "Vehicle id cannot be null");
    mIsDataMissing = true;
    start();
}