private java.lang.String calc(java.lang.String input) {
    java.lang.String total = "";
    total.concat(input.substring(2));
    total.concat(input.substring(0, 2));
    return total;
}