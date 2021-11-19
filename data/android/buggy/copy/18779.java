@java.lang.Override
public java.awt.Point computerMove(tronplease.TronBike bike) {
    java.awt.Point suggestedLocation = bike.getLocation();
    suggestedLocation = suggestLocation(bike);
    return suggestedLocation;
}