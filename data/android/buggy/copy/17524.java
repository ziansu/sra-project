@java.lang.Override
public java.lang.Long parse(java.lang.String val) {
    try {
        return java.lang.Long.parseLong(val);
    } catch (java.lang.NumberFormatException e) {
        return null;
    }
}