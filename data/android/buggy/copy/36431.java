public boolean isEvent() {
    if (("".equals(from)) || ("".equals(to))) {
        return false;
    }
    return true;
}