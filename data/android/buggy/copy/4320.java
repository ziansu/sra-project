public void reload() {
    sosconnector.Parser.DomParser domFromSource = createDomFromSource(sourceParser);
    this.hashGroup = new sosconnector.Parser.NodeParser(domFromSource, configure).parse();
}