public static java.lang.String i18n(java.lang.String str, java.lang.Object... args) {
    if ((args == null) || ((args.length) == 0)) {
        return str;
    }else {
        return java.lang.String.format(str, args);
    }
}