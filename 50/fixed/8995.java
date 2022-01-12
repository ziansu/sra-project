private final int indexOfForName() {
    return hasParent() ? getParent().indexOfForName(this) : 0;
}