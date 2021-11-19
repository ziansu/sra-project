boolean imageViewReused(com.example.futin.importimages.RestService.loaders.PhotoToLoad photoToLoad) {
    java.lang.String tag = imageViews.get(photoToLoad.imageView);
    if ((tag == null) || (!(tag.equals(photoToLoad.file.getName()))))
        return true;
    
    return false;
}