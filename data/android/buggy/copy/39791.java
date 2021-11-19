public static <T> java.util.List<T> nullToEmptyList(java.util.List<T> newValue) {
    if (newValue == null) {
        return com.google.common.collect.Lists.newArrayList();
    }
    return newValue;
}