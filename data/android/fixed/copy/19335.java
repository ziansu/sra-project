public boolean intersects(io.bifroest.commons.model.Interval interval) {
    return (this.contains(interval.start)) || (this.contains(interval.end));
}