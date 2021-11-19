private static boolean equalsNull(final java.lang.Object o1, final java.lang.Object o2) {
    if (o1 == null)
        return o2 == null;
    
    return (o2 != null) && (o1.equals(o2));
}