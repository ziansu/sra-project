@java.lang.Override
public boolean test(java.lang.String header) {
    return ((patterns.size()) == 0) || (patterns.stream().anyMatch(( pattern) -> pattern.matcher(header).matches()));
}