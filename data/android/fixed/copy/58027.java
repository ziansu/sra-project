public void addImages(java.util.List<com.imagesearch.model.data.ImageData> newImages) {
    images.addAll(newImages);
    notifyItemRangeInserted(total, newImages.size());
    total = (total) + (newImages.size());
}