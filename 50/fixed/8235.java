public void changeLimit(java.lang.Integer freeTime) {
    if ((freeTime < 24) && (freeTime > (-1))) {
        this.freeTime = freeTime;
    }else {
        throw new java.lang.IllegalArgumentException("Incorrect number of hours, number can't be greater than 24 or negative");
    }
}