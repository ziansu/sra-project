public void addOptionalEnderEnd(final simple.CIString otag, final simple.CIString etag) {
    simple.ml.ParserConstants.log.debug("Add Option ender end", ((etag + " ends ") + otag));
    OPTIONALENDEND.add(otag, etag);
}