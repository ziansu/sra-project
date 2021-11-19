public com.hsjawanda.gaeobjectify.util.UriParser build() {
    com.hsjawanda.gaeobjectify.util.UriParser parser = new com.hsjawanda.gaeobjectify.util.UriParser();
    parser.consumeMapping = this._consumeMapping;
    parser.hasAction = this._hasAction;
    return parser;
}