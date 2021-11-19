public boolean isStation() {
    return ((this.parentStation) == 0) && (((this.locationType) != null) && (this.locationType.isStation()));
}