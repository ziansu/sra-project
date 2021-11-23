@java.lang.Override
public javafx.scene.image.Image getImage() {
    if (this.animated) {
        return this.animation.getCurrentFrame();
    }
    return this.image;
}