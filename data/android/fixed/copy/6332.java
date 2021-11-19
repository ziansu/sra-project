public void updateCar(com.example.reabar.wimc.Model.Car car, com.example.reabar.wimc.Model.Model.SyncListener listener) {
    modelSql.updateCar(car);
    modelFirebase.updateCar(car, listener);
    updateCarDbTime();
}