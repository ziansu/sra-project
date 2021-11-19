private void displayPreviewFromCachedPage(org.wikipedia.page.Page page) {
    progressBar.setVisibility(View.GONE);
    contents = new org.wikipedia.page.linkpreview.LinkPreviewContents(page);
    layoutPreview();
}