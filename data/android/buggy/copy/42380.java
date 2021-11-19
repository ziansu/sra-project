public double getSize() {
    return java.lang.Double.parseDouble(new java.text.DecimalFormat("##.##").format(((size) / 1024)));
}