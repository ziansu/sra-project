public int getDuration() {
    if (((dateEnd) == 0) || ((dateBegin) == 0)) {
        return 0;
    }
    return java.lang.Math.round((((dateEnd) - (dateBegin)) / 1000));
}