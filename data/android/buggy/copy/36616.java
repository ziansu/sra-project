public void setDriverStatus(final org.eclipse.kura.driver.DriverStatus status) {
    org.eclipse.kura.Preconditions.checkNull(this.value, "Driver Status cannot be null");
    this.driverStatus = status;
}