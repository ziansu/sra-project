public boolean requestIsQueryUser() {
    return ((parts.length) < 2) && (parts[1].matches("\\d+"));
}