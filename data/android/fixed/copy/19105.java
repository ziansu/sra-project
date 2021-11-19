public java.lang.String getAsString() {
    if (isEmpty())
        return null;
    
    if ((value) instanceof java.lang.String) {
        return ((java.lang.String) (value));
    }else {
        return value.toString();
    }
}