public void addToPictures(android.net.Uri picture) {
    if ((pictures) == null) {
        pictures = new java.util.ArrayList<android.net.Uri>();
        pictures.add(picture);
    }else {
        pictures.add(picture);
    }
}