public java.lang.String formatSumm(long f) {
    java.text.DecimalFormatSymbols s = new java.text.DecimalFormatSymbols();
    return summFormat.format(f).replace(",", " ");
}