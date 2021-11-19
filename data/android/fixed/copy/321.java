public static void details(java.lang.Long galleryId) {
    models.Gallery gallery = models.Gallery.findById(galleryId);
    java.util.List<models.Photo> photos = models.Photo.findByGalleryAndRevalidate(gallery, 10);
    render(gallery, photos);
}