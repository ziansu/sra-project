public org.smoothbuild.parse.Maybe<E> addErrors(java.util.List<? extends java.lang.Object> errors) {
    return new org.smoothbuild.parse.Maybe<>((errors.isEmpty() ? result : null), org.smoothbuild.parse.Maybe.concatErrors(this.errors, errors));
}