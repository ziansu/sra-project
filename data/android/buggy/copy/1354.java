public com.rw.velocity.RequestBuilder withBody(java.lang.String params) {
    this.rawParams = params;
    this.contentType = Velocity.ContentType.TEXT;
    return this;
}