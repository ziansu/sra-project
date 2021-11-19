public java.lang.String getTextRendering() {
    if (textRepresentation.startsWith("\""))
        return textRepresentation.substring(1, ((textRepresentation.length()) - 1));
    else
        return textRepresentation;
    
}