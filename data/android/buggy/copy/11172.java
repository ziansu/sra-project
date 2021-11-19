public java.lang.String format(float f) {
    java.text.DecimalFormatSymbols s = new java.text.DecimalFormatSymbols();
    return myFormat.format(f).replace(",", " ");
}