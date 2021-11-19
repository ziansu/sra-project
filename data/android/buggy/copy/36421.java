public boolean isComparison() {
    if ((isComparison) != null) {
        return isComparison;
    }else {
        return parent.isComparison();
    }
}