public programReduction.Paths pop() {
    if ((this) == (programReduction.Paths.empty)) {
        throw new programReduction.Paths.EmptyPath();
    }
    return this.next;
}