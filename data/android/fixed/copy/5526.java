public boolean move(int elapsed_seconds) {
    this.current_location = location(elapsed_seconds);
    return ((current_location[0]) >= 0) && ((current_location[1]) >= 0);
}