public void addXML() {
    assert (input) != null : "Input is null";
    input = dateParser.XMLParser.removeAllTags(input);
    addXMLDate();
    addXMLID();
    addXMLCmd();
    addXMLTitleDesc();
    addXMLGarbage();
}