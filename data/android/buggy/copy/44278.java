protected float calculateKgCo2FromDriving(float drivingDistance) {
    return prefs.getBoolean("pref_key_car_owner", true) ? calculateKgCo2FromDriving(drivingDistance, getEmissionsPrLitre(), getLitrePerKm()) : 0;
}