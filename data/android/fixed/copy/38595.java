public boolean isValid() {
    java.util.List<abstractPattern.Name> dimensionSignature = this.getDimensionSignature();
    if ((dimensionSignature.getNumChild()) == 0)
        return false;
    
    return true;
}