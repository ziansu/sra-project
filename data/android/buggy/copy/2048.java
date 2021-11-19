@java.lang.Override
public boolean test(java.lang.String header) {
    return patterns.stream().anyMatch(( pattern) -> pattern.matcher(header).matches());
}