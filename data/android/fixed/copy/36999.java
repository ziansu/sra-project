void setImageSize(int width, int height) {
    if (((imageWidth) == width) && ((imageHeight) == height))
        return ;
    
    imageWidth = width;
    imageHeight = height;
    dirty = true;
}