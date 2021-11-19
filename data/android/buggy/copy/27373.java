public java.lang.String FormatDecimal(java.lang.String x) {
    java.text.DecimalFormat df = new java.text.DecimalFormat("#,###");
    java.lang.String s = df.format(java.lang.Double.parseDouble(x));
    return s;
}