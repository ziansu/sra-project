public com.pengie.tux.bostonhub.T.Stop getStop(java.lang.String stopName) {
    com.pengie.tux.bostonhub.T.Stop isStop = directions.get(0).getStop(stopName);
    if (isStop == null) {
        return null;
    }
    return isStop;
}