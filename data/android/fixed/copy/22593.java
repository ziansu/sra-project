private synchronized java.lang.String setNumber(java.lang.String number) {
    if (number != null) {
        number = number.replaceAll("[^\\d+]", "");
    }
    mNumber = number;
    return mNumber;
}