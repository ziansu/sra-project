private boolean isValidResourceSelection(int numericSelection) {
    return (numericSelection >= 0) && (numericSelection < (usages.size()));
}