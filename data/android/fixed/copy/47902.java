public java.lang.String signChange(java.lang.String num) {
    if (!(num.equals("0")))
        return java.lang.Double.toString(((java.lang.Double.parseDouble(num)) * (-1)));
    else
        return "0";
    
}