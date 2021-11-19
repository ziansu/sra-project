public void addSingleLowImageUrl(java.lang.String lowImageUrl) {
    if (lowImageUrl == null) {
        throw new java.lang.NullPointerException("lowImageUrl is null");
    }
    if ((lowImgUrls) == null) {
        lowImgUrls = new java.util.ArrayList<>();
    }
    lowImgUrls.add(lowImageUrl);
}