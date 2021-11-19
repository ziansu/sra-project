public int getImageWidth() throws java.io.IOException {
    if ((imgWidth) == 0) {
        synchronized(reader) {
            imgWidth = reader.getWidth(0);
        }
    }
    return imgWidth;
}