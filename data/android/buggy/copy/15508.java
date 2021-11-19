public java.lang.String getLostWeight() {
    double lostWeight = (startWeight) - (weight);
    return java.lang.String.valueOf(((java.lang.Math.round((lostWeight * 10))) / 10));
}