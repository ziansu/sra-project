private void setAlignment(int position, com.univocity.parsers.fixed.FieldAlignment alignment) {
    if (alignment == null) {
        throw new java.lang.IllegalArgumentException("Alignment cannot be null");
    }
    validateIndex(position);
    this.fieldAlignment.set(position, alignment);
}