private void setBottomSheet(com.peike.theatersubtitle.db.Subtitle subtitle) {
    subtitleDetailBottomSheet.setVisibility(View.VISIBLE);
    subtitleDetailBottomSheet.setState(BottomSheetBehavior.STATE_COLLAPSED);
    subtitleDetailBottomSheet.updateDetail(subtitle);
    subtitleDetailBottomSheet.showPeekHeader();
}