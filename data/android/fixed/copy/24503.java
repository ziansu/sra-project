public java.lang.String getImageURL() {
    if (((imagesList) == null) || (imagesList.isEmpty())) {
        return null;
    }
    return imagesList.get(0).getURL();
}