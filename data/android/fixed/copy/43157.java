private java.lang.String getPath(com.ckkeith.duration_collector.DurationCollector.CollectionParams cp, int dayOfWeek) {
    return (((dirForResults) + "/") + (cp.toString(dayOfWeek))) + ".txt";
}