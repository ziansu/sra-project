public com.squareup.okhttp.HttpUrl.Builder fragment(java.lang.String fragment) {
    if (fragment == null)
        throw new java.lang.IllegalArgumentException("fragment == null");
    
    this.encodedFragment = com.squareup.okhttp.HttpUrl.canonicalize(fragment, com.squareup.okhttp.HttpUrl.FRAGMENT_ENCODE_SET, false, false);
    return this;
}