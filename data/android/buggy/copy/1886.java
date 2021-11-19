public com.brweber2.unification.UnificationResult next(com.brweber2.unification.UnificationResult result) {
    if (this.equals(result)) {
        return this;
    }
    this.next = result;
    return result;
}