public static java.lang.String color(java.lang.String str) {
    return com.jroossien.boxx.util.Str.COLOR.matcher(str).replaceAll("§$1");
}