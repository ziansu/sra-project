public long getTime(org.yamj.filescanner.model.TimeType timeType) {
    if (times.containsKey(timeType)) {
        return times.get(timeType);
    }else {
        return 0L;
    }
}