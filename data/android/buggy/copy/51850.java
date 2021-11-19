public boolean exists(java.lang.String name) {
    if (data.containsKey(name)) {
        return true;
    }
    if ((transitive) && ((previous) != null)) {
        return previous.exists(name);
    }
    return false;
}