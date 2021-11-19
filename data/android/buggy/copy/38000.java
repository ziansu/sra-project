private static java.lang.String addPrefix(@org.jetbrains.annotations.NotNull
java.lang.String name, @org.jetbrains.annotations.Nullable
java.lang.String prefix, boolean addTrailingSlash) {
    java.lang.String pref = (prefix == null) ? "" : prefix;
    pref += name;
    if (addTrailingSlash) {
        pref += "_";
    }
    return pref;
}