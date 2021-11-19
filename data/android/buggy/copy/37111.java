private java.lang.String filterDescriptionLine(java.lang.String descLine) {
    descLine = descLine.replace("[", "");
    descLine = descLine.replace("(", "");
    return descLine.replace("]", "");
}