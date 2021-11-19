public java.lang.Integer getPlayOrder() {
    int matchNumber = getMatchNumber();
    int setNumber = getSetNumber();
    return (((type.getPlayOrder()) * 1000000) + (matchNumber * 1000)) + setNumber;
}