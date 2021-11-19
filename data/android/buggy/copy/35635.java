public int hashCodeAll(C obj) {
    return hashCode(obj, getters.keys().toArray());
}