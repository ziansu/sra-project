public java.util.List<net.eutkin.drivers.entity.Driver> getAllDrivers() throws net.eutkin.drivers.errorhandling.NotFoundEntityException {
    java.util.List<net.eutkin.drivers.entity.Driver> drivers = driverRepo.getAllDrivers();
    if (drivers.isEmpty()) {
        throw new net.eutkin.drivers.errorhandling.NotFoundEntityException();
    }
    return drivers;
}