public com.squareup.okhttp.HttpUrl.Builder encodedFragment(java.lang.String encodedFragment) {
    this.encodedFragment = (encodedFragment != null) ? com.squareup.okhttp.HttpUrl.canonicalize(encodedFragment, com.squareup.okhttp.HttpUrl.FRAGMENT_ENCODE_SET, true, false) : null;
    return this;
}