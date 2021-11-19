public void updateVehicleList(model.Vehicle.Vehicle v) {
    userManager.addVehicle(v);
    vehicleList = userManager.getRegisteredUserVehicles();
    notifyDataSetChanged();
}