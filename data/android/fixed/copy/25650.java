public void setImage(java.awt.Image image) {
    _image = (image != null) ? image.getScaledInstance(_width, _height, java.awt.Image.SCALE_SMOOTH) : null;
    setOperation(models.TileModel.EVENT_IMAGE_CHANGED);
    doneUpdating();
}