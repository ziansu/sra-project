public boolean isStringValueEmpty() {
    java.lang.String toStringValue = this.toString();
    toStringValue.replace("source=\"", "");
    if (toStringValue.contains("=\"\""))
        return false;
    else
        return true;
    
}