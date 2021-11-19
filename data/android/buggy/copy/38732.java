public long addTime(long time) {
    this.time += time;
    this.changed = true;
    return this.time;
}