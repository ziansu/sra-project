public java.lang.String asFizzBuzzText() {
    return java.lang.String.join(" ", values.stream().map(NaturalNumber::asFizzBuzzText).collect(java.util.stream.Collectors.toList()));
}