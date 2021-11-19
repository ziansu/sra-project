public void onWardrobeItemClicked(int type, de.ur.mi.fashionapp.wardrobe.model.WardrobeItem item) {
    startActivity(de.ur.mi.fashionapp.util.LinkService.getDetailIntent(this, type, item, wardrobeID, null));
}