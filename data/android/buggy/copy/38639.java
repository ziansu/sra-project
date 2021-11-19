public boolean isMatchUrl(java.lang.String url) {
    return mPattern.matcher(url).find();
}