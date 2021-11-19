public boolean isOutsideStation() {
    return ((this.parentStation) == 0) && (this.locationType.isStop());
}