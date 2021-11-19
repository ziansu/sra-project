@org.jetbrains.annotations.NotNull
public static java.lang.String unescapeChar(@org.jetbrains.annotations.NotNull
final java.lang.String string, final char toUnescape) {
    final java.lang.String toUnescapeStr = java.lang.String.valueOf(toUnescape);
    return string.replace(("\\\\" + toUnescapeStr), toUnescapeStr);
}