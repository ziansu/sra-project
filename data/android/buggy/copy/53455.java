private void setAlignment(com.univocity.parsers.fixed.FieldAlignment alignment, int position) {
    if (alignment == null) {
        throw new java.lang.IllegalArgumentException("Alignment cannot be null");
    }
    validateIndex(position);
    this.fieldAlignment.set(position, alignment);
}