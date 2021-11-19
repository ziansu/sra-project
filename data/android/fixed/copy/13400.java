public final boolean isNumeric(java.lang.String text) {
    if (this.inDictionary(text)) {
        return false;
    }else {
        return text.matches("^[+-]{0,1}\\d{1,3}(?:[,]\\d{3})*(?:[.]\\d*)*$");
    }
}