public void initLocation(android.location.Location location) {
    this.location = location;
    if (isResumed())
        setup();
    
}