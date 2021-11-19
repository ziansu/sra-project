public org.newdawn.slick.Image getImage() {
    setDefaultImage();
    return (skinImage) != null ? skinImage : defaultImage;
}