public boolean sameSubGroup(com.suushiemaniac.cubing.alglib.util.SubGroup other) {
    return ((this.size()) == (other.size())) && (this.containsAll(other));
}