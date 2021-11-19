@java.lang.Override
public void onViewPositionChanged(float fractionAnchor, float fractionScreen) {
    if ((fullFormAdapter) != null) {
        fullFormAdapter.setItemValues(itemValues);
        fullFormAdapter.setCasePhotoAdapter(casePhotoAdapter);
    }
}