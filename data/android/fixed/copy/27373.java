public java.lang.String FormatDecimal(java.lang.String x) {
    if (x == null)
        return "0";
    
    java.text.DecimalFormat df = new java.text.DecimalFormat("#,###");
    java.lang.String s = df.format(java.lang.Double.parseDouble(x));
    return s;
}