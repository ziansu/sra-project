public boolean overlap(asteroids.model.Entity otherEntity) {
    if (this.equals(otherEntity))
        return true;
    
    double distance = this.getDistanceBetween(otherEntity);
    return distance < 0;
}