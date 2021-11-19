public void setBadCancellationCount(final int theBadCancellationCount) {
    if (theBadCancellationCount <= 0) {
        throw new java.lang.IllegalArgumentException("Parameter can't be less than 0");
    }else {
        this.myBadCancellationCount = theBadCancellationCount;
    }
}