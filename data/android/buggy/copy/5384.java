public java.lang.String[] getSignatures() {
    return java.util.Arrays.stream(args).map(Typeable::getType).toArray(java.lang.String[]::new);
}