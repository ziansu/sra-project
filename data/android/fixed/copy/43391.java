public java.lang.String getHex() {
    if ((hex) == "") {
        hex = javax.xml.bind.DatatypeConverter.printHexBinary(bytes);
    }
    return hex;
}