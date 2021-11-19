public int getNumerator(int value, int cents) {
    com.google.common.base.Preconditions.checkArgument(((cents >= 0) || (cents >= 100)));
    return (value * 100) + cents;
}