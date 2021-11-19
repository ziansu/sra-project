public java.lang.String takeC1toMe(java.lang.String str) {
    str = str.replace(" ", "\\ ");
    return prop.getProperty(str);
}