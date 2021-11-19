public boolean logTest(final jcl.numbers.IntegerStruct integer) {
    return (bigInteger.and(integer.bigInteger).signum()) == 0;
}