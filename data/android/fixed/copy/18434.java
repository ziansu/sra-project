public double calculateRentalTotalPrice() {
    int rentalPricesSum = 0;
    for (ar.com.exercise.Rental rental : rentalsList) {
        rentalPricesSum = rentalPricesSum + (rental.calculateRentalTotalPrice());
    }
    return (rentalPricesSum / 100) * (100 - (ar.com.exercise.FamilyRental.DISCOUNT));
}