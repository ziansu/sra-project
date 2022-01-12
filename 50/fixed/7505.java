public void removePicture(java.lang.String picture) {
    if ((pictures) == null) {
        pictures = new java.util.HashSet<>();
    }
    pictures.remove(picture);
}