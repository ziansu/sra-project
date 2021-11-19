public boolean isComparison() {
    if ((isComparison) != null) {
        return isComparison;
    }else
        if ((parent) != null) {
            return parent.isComparison();
        }else {
            return false;
        }
    
}