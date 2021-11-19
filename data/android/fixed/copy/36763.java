public boolean isConsistent() {
    return ((get) - (put)) == (((create) - (destroy)) - (idle));
}