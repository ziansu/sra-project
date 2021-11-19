public boolean isInsideStation() {
    return ((this.parentStation) != 0) && (((this.locationType) != null) && (this.locationType.isStop()));
}