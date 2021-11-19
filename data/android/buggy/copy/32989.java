public org.pojava.datetime.MutableString trim() {
    startIndex = firstNonWhiteSpace();
    endIndex = lastNonWhiteSpacePlusOne();
    return this;
}