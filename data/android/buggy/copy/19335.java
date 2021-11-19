public boolean intersects(io.bifroest.commons.model.Interval interval) {
    return ((interval.start) < (end)) || ((interval.end) > (start));
}