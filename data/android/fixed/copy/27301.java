private void setBottomSheet(com.peike.theatersubtitle.db.Subtitle subtitle) {
    subtitleDetailBottomSheet.setVisibility(View.VISIBLE);
    subtitleDetailBottomSheet.updateDetail(subtitle);
}