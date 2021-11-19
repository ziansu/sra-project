public boolean isConsistent() {
    return ((this.get) - (this.put)) == (((create) - (destroy)) - (idle));
}