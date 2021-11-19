public void selectAllImages() {
    for (vn.mbm.phimp.me.ImageItem imageItem : vn.mbm.phimp.me.newGallery.localImageList) {
        if (!(deletableList.contains(imageItem.path))) {
            imageItem.isSelected = true;
            deletableList.add(imageItem.path);
        }
    }
    notifyDataSetChanged();
}