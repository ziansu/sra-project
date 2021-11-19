public org.newdawn.slick.Image getImage() {
    if ((defaultImage) == null)
        setDefaultImage();
    
    return (skinImage) != null ? skinImage : defaultImage;
}