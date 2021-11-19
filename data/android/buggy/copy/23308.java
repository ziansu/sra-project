public void setSource(java.lang.String source) {
    this.source = source;
    if (!(isSourceValue())) {
        type = InputType.DocumentProperty;
    }
}