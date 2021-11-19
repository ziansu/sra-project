public double setFirstGearPercentage(final double gearPercentage) {
    if ((gearPercentage > 1.0) || (gearPercentage < 0.0)) {
        this.oneOrRightFirstGearPercentage = 1.0;
    }else {
        this.oneOrRightFirstGearPercentage = gearPercentage;
    }
    return this.getFirstGearPercentage();
}