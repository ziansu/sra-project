void populateViews(im.vector.adapters.AdapterSection item) {
    mSection = item;
    vSectionTitle.setText((item != null ? item.getTitle() : null));
}