public spade.storage.kafka.Edge.Builder setHash(java.lang.CharSequence value) {
    validate(fields()[3], value);
    this.hash = value;
    fieldSetFlags()[3] = true;
    return this;
}