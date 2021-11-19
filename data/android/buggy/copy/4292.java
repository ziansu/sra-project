private boolean matchesNameSpace(java.lang.String otherNameSpace) {
    java.lang.String nameSpace = healthCodeTaxonomy.getNameSpace();
    java.text.Collator collator = rifServices.system.RIFServiceMessages.getCollator();
    return collator.equals(nameSpace, otherNameSpace);
}