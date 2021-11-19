void verify() {
    if (!(satisfied)) {
        throw new java.lang.AssertionError(stubbedMethod.toString());
    }
}