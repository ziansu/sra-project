public org.demyo.model.Image getMainImage() {
    if ((images.size()) == 0) {
        return null;
    }
    return images.iterator().next();
}