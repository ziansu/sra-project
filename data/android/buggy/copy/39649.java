private void showCarsByType(int carType) {
    switch (carType) {
        case com.lyftoxi.lyftoxi.ShareRideActivity.OWN_CAR :
            showOwnCars();
            break;
        case com.lyftoxi.lyftoxi.ShareRideActivity.RENTED_CAR :
            showRentedCars();
            break;
        default :
            finish();
            dialog.dismiss();
    }
}