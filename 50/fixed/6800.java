public java.util.List<java.lang.String> getValues() {
    java.lang.String[] split = value.split(",", (-1));
    java.util.List<java.lang.String> values = java.util.Arrays.asList(split);
    return values;
}