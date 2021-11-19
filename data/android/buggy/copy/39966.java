public void prevMainImage() {
    if ((this.neighborGenerator) == null) {
        this.initGenerator();
    }
    (this.mainImageID)--;
    this.neighborGenerator.setMainImage(this.mainImageID);
}