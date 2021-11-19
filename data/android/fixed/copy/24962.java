public static java.awt.Color colorFromColorName(java.lang.String colorStr) {
    java.lang.String str = colorStr.replaceAll("\\s", "");
    org.asqatasun.utils.colornamelookup.ColorNameLookup c = new org.asqatasun.utils.colornamelookup.ColorNameLookup();
    return c.getColorFromName(str);
}