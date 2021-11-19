public com.squareup.okhttp.HttpUrl.Builder fragment(java.lang.String fragment) {
    this.encodedFragment = (fragment != null) ? com.squareup.okhttp.HttpUrl.canonicalize(fragment, com.squareup.okhttp.HttpUrl.FRAGMENT_ENCODE_SET, false, false) : null;
    return this;
}