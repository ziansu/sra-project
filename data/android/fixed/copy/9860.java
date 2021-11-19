@java.lang.Override
public boolean isIgnored(java.lang.String fullname) {
    return ignorePackages.stream().anyMatch(( p) -> (fullname.startsWith((p + (DOT)))) || (fullname.equals(p)));
}