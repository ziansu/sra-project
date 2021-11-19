public de.pandigo.cars.models.car.CarBuilder withKmDriven(final int kmDriven) {
    if ((kmDriven < 0) && (kmDriven > (de.pandigo.cars.models.car.CarBuilder.MAX_KM_DRIVEN))) {
        throw new de.pandigo.cars.exceptions.CarConfigRuntimeException("The amount of km driven makes no sense.");
    }
    this.car.setKm(kmDriven);
    return this;
}