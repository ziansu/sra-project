public boolean isInsideStation() {
    return ((this.parentStation) != 0) && (this.locationType.isStop());
}