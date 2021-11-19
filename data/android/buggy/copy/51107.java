public void setCreepFactor(boolean creepFactor) {
    if (((minAge) >= (baeAge)) && ((maxAge) <= (baeAge))) {
        creepFactor = true;
    }else {
        creepFactor = false;
    }
    this.creepFactor = creepFactor;
}