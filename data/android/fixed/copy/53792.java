void verify() {
    if (!(satisfied.get())) {
        throw new java.lang.AssertionError(stubbedMethod.toString());
    }
}