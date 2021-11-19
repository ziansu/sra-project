public static java.lang.String i18n(java.lang.String str, java.lang.Object... args) {
    if (args != null) {
        return java.lang.String.format(str, args);
    }else {
        return str;
    }
}