private void checkUnexpectedLength(int newIndex) throws org.lorecraft.phparser.SerializedPhpParserException {
    if (((this.index) > (this.inputLength)) || (newIndex > (this.inputLength))) {
        throw new org.lorecraft.phparser.SerializedPhpParserException("Unexpected end of serialized Input!", this.index);
    }
}