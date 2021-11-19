public javafx.scene.image.Image getImage() {
    if (this.animated) {
        this.animation.getCurrentFrame();
    }
    return this.image;
}