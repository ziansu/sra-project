private void onSelectedResource(int index) {
    updateCurrentResource();
    currentResourceIndex = index;
    mCurrentConnectionTypeIndex = 0;
    updateResourceTable();
}